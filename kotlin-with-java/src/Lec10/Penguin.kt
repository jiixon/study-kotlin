package Lec10

class Penguin(
    species: String
) : Animal(species,2), Swimable, Flyable {
    //코틀린에서는 상속, 인터페이스구현 모두 : 사용

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    //추상 클래스에서 자동으로 만들어진 getter를 override 해서 새로 정의(==custom getter, 프로퍼티 형식으로 적은 것)
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
        //상위 인터페이스의 함수를 override 하는 방법: super<타입>.함수
    }

    //val 이므로 getter에 대한 override를 기대
    override val swimAbility: Int
        get() = 3
    //swimAbility: (1)getter에 대한 default 메소드
    //(2)getter에 대한 추상메소드를 인터페이스에 만듦 -> backing field 없는 프로퍼티를 인터페이스에 만든셈
}

//추상클래스
//공통점 : 자바, 코틀린 모두 추상클래스는 인스턴스화 할 수 없음

//인터페이스
//공통점 : 자바, 코틀린 모두 인터페이스를 인스턴스화 할 수 없음
//코틀린에서 backing field가 없는 프토퍼티에 만들 수 있음

