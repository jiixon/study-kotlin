package Lec09

fun main() {
    val person = Person()
    println(person.name) //.필드로 getter, setter 호출
    person.age = 10
    println(person.age)

    //이때, JavaPerson이여도 getter, setter 정의되어 있으면 -> .필드로 동일하게 사용가능
}

class Person(
    name: String = "jiwon",
    var age: Int = 1
) {
    //초기 호출 블록
    init {
        if (age < 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //추가 생성자
    //this가 위의 기본 생성자를 호출
    constructor(name: String): this(name, 1) {
        //부생성자는 body 가질수 있음
        println("부생성자 1")
    }

    //최종적으로 주생성자를 this로 호출해야 함
    constructor(): this("jiwon") {
        println("부생성자 2")
    }

    //로직
    //두번째 constructor -> 첫번째 constructor 호출 -> 주생성자 호출
    //최종적으로는 주생성자를 호출하는 셈

    //출력(생성자 순서)
    //초기화 블록
    //부생성자 1
    //부생성자 2
    //jiwon
    //10

    //부생성자보다 default parameter를 권장
    //converting과 같은 경우 부생성자를 사용할 수 있지만 -> 정적 팩토리 메소드 추천
    //예시, Alien이 와서 Person으로 바뀌어야 하는 경우 : 주생성자에 Alien을 넣을 수 없음

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    //커스텀 getter, setter (위 isAdult() 만드는 또다른 방법)
    //프로퍼티처럼 만들 수도 있음(위는 함수처럼)
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
        //get() = this.age >= 20 //가능

    //객체의 속성이라면? custom getter, 그렇지 않으면 함수

    //name을 get할 때 반드시 대문자로 바꾸어주는 경우 -> custom getter
    //이 경우, (1) 기본에 기본생성자에 val을 없애고,(기존에 자동생성되는 getter 사라짐)
    //(2) 주생성자에서 받음 name을 불변 프토퍼티 name에 바로 대압
    //(3) name.uppercase()로 하면 name에 대한 getter를 호출하니까 다시 get을 호출 -> 무한루프
    //(4) 정확하게 field(자기자신을 가리키는 예약어) => 보이지 않는 필드(backing field라고 불림)(드문 경우)
    var name = name //아래 예제 custom setter 때문에 var로 변경
        get() = field.uppercase()

    //isAdult의 custom getter처럼 쓰는경우가 좀더 많다
    //(1)기본생성자 val 그대로 둠
    //(2) 자기자신 기라키는 걸로 this.name을 사용
//    val uppercaseName: String
//        get() = this.name.uppercase()


    //custom setter -> 무한루프 발생가능하기 때문에 (재정의 그안에서 this.name을 부름 -> field 사용)
    set(value) {
        field = value.uppercase()
    }
}
//나이검증 -> init{} 블록 : 클래스가 초기화되는 시점에 한번 호출되는 블록
//값을 적절히 만들어주거나 validation 로직을 넣거나 하는 용도로 사용


//constructor 지시어 생략 가능
//생성자를 만듦과 동시에 프로퍼티 선언 가능 + 바디도 생략 가능
//프로퍼티 = 필드 + getter + setter
//코틀린에서 필드만 만들면 getter, setter 자동 생성
//즉, val -> 프로퍼티 + getter
//   var -> 프로퍼티 + getter + setter
//class Person constructor (name: String, age: Int) {
//    val name = name
//    var age = age
//}