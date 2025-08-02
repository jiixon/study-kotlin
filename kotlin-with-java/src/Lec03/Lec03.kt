package Lec03

fun main() {
    val number1 = 3 //Int
    val number2 = 3L //Long
    val number3 = 3.0f //Float
    val number4 = 3.0 //Double

    //코틀린 -> 더 큰 타입으로 암시적 타입 변경 불가능 (자바와 다른점)
    //명시적 타입변경: toLong()과 같이 to변환타입()사용
    val number5: Int = 4
    val number6: Long = number5.toLong()

    //null이 가능한 경우의 타입 변환
    val number7: Int? = 3
    val number8: Long = number7?.toLong() ?: 0L

    //String interpolation
    val person = Person("지원", 26)
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    println(log)
    val name = "지원"
    println("이름: $name") //가능은 하나, ${변수}를 지향

    """
        여기에 indentation 들어가고, trimIndent()로 제거 -> 자유롭게 문자열
    """.trimIndent()

    val str = "ABC"
    println(str[0]) //A
    println(str[2]) //C


}

fun printAgeIfPerson(obj: Any) {
    if(obj is Person){
        val person = obj as Person
        println(person.age)
        //굳이 선언 안해주고 println(obj.age)도 가능 -> 스마트 캐스트
    }

    //is 의 반대 -> !is
    //if(obj !is Person) //obj가 Person 타입이 아니라면,
}

//obj의 null이 들어올 수 있는 경우
fun printAgeIfPerson2(obj: Any?){
    //as? - obj가 null이 아니라면 Person 타입으로 변환, null이라면 전체가 null -> 안전한 타입 형변환
    //즉, println(person.age) 컴파일 에러 -> println(person?.age)로 변경해주어야 함
    val person = obj as? Person
    println(person?.age)
}

