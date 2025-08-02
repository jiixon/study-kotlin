package Lec10

fun main() {
    Derived(300)
}
open class Base (
    open val number: Int = 100
){
    init {
        println("Base Class")
        println(number)
    }
}

class Derived (
    override val number: Int
) : Base(number){
    init {
        println("Derived Class")
    }
}

//open class : 다른 클래스가 상속받을 수 있도록 열어둠
//number 프로퍼티도 override 할수 있도록 -> open val number

//출력
//Base Class
//0
//Derived Class
//(1) 상위 클래스의 init이 실행됨 -> Base Class
//(2) 상위클래스 생성자가 실행되는 동안 하위클래스의 프로퍼티(Drived)를 인스턴스화 했음(==Drived의 nubmers에 값을 집어넣어줌)
//(3) 상위클래스의 init에서 number를 호출 -> 하위클래스에 넘버 가져옴, 하지만 아직 상위클래스에 constructor가 먼저 실행된 단계
//(4) 즉, 하위 클래스에 number라는 값에 초기화가 이루어지지 않음
//(5) 그 상태에서 먼저 하위 클래스의 number에 접근 -> 아무값도 아닌 int 초기값 0이 출력
//상속시 주의사항 : 상위 클래스에 constructor 와 init 블락에서는 하위 클래스의 field에 접근하면 안됨
//정확히, final이 아닌 프로퍼티에 접근하면 안됨

//상위클래스에서 하위클래스가 override 하고있는 프로퍼티를 생성자 블록이나 init블록에 쓰게되면 이상한 값이 나갈 수 있음
//상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야함

//