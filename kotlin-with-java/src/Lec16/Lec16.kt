package Lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge() //멤버함수 우선적 호출
}

//확장 함수 -> String 클래스 확장
fun String.lastChar(): Char {
    return this[this.length - 1]
}
//확장함수
//private 또는 protected 멤버 가져올수 없음 -> 캡슐화 깨지므로

//확장함수 -> Person 클래스의 nextYearAge() : 멤버함수와 시그니처 같은 경우
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}