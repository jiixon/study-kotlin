package Lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}


class Person private constructor(
    val name: String,
    val age: Int
){
    //static 존재X -> companion object(동행 객체)
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행 객체")
        }
    }
    //그냥 val : 변수에 0값이 런타임시에 할당
    //const val : 변수가 컴파일시에 할당
}
//companion object -> 말그대로 객체
//1. 이름 붙일 수 있음 Factory
//2. interface 구현도 가능 : Log (-> 당연히 추상메서드 override)
//3. 유틸성 함수들을 넣어도 되지만, 유틸성 함수는 최상단 파일 활용 추천

//사용법(자바에서 사용)
//이름 없는 경우: Person.Companion.newBaby()
//이름 있는 경우: Person.Factory.newBaby()
//이름 관계 없이 사용하고 싶은 경우 @JvmStatic 애노테이션 -> Person.newBaby()

//val baby = Person.newBaby("aa") <- 코틀린에서 사용

//코틀린의 singleton
object Singleton {
    var a: Int = 0
}