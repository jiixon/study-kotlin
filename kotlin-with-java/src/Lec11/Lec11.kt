package Lec11

val NUM = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

open class Cat protected constructor() {}

//하나의 파일에 변수, 함수, 클래스 여러개 바로 만들기 가능
//전부 public 생략된 상태
//protected 파일에는 사용 불가능
//protected : 선언된 클래스, 하위 클래스에 작동하는 지시어
//생성자에 접근지시어 주의할 점
// constructor 직접 써주어야함 (이때, 하위클래스를 애당초 못만드는게, final이 자동으로 붙기 떄문에 open을 붙여줘야함)
//클래스를 상속해서 하위클래스를 만들고 싶다면, 기본이 final이므로 반드시 open을 붙여야함
