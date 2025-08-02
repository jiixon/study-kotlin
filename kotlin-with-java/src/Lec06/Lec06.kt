package Lec06

fun main() {
    //for-each문
    //1. 컬렉션 만드는 법 - listOf()
    //2. :(java) 대신 in(kotlin) 사용
    //3. in 뒤에는 java와 동일하게 Iterable이 구현된 타입이라면 모두 가능
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers) {
        println(number)
    }

    //전통적인 for문
    for(i in 1..3){
        println(i)
    }
    for(i in 3 downTo 1){ //내려가는 경우
        println(i)
    }
    for(i in 1..5 step 2){ //2칸씩 올라가는 경우
        println(i)
    }
    //..에는 Range 클래스를 만들어 냄 - 이 클래스는 Progression(등차수열)을 상속받고 있음 (default가 step1)
    //downTo, step : 중위 호출 함수
    //기존 함수호출 : 변수.함수이름(argument)
    //중위 호출함수 : 변수 함수 argument

    //while문
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}