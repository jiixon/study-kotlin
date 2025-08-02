package Lec08

fun main() {
    repeat("Hello World")
    println("---")
    repeat("Hello World", 4, true) //기본값이 있어도 다시 넣어줘도 무방
    println("---")

    //named argument : 매개변수 이름을 통해 직접 지정, 지정되지 않은 매개변수는 기본값 사용
    repeat("Hello World", useNewLine = false)
    println("---")

    //장점 - builder를 직접 만들지 않고 builder의 장점을 가짐
    //주의 - kotlin에서 java 함수 가져다 사용할 때는 named argument 사용 불가능
    printNameAndGender(name = "지원", gender = "FEMALE")

    //가변인자
    //* - spread 연산자 : 가변인자 함수를 배열과 함께 호출시 붙여야함
    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//1. public 접근지시어 생략 가능
//2. 함수가 하나의 결과 값이면 block 대신 = 사용 가능
//3. Int 반환 타입도 생략 가능
//block {}을 사용하는 경우, 반환 타입이 Unit이 아니라면, 반드시 명시적으로 작성
fun max2(a: Int, b: Int): Int = if (a > b) a else b
fun max3(a: Int, b: Int) = if (a > b) a else b

//함수 -> 클래스 안에 있을 수도, 파일 최상단에 있을 수도, 한 파일 안에 여러 함수가 있을 수도

//default parameter : 밖에서 파라미터를 넣어주지 않으면 기본값을 사용
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) println(str)
        else print(str)
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for(str in strings){
        println(str)
    }
}