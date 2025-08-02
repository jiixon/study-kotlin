package Lec05

//1. 함수에서 Unit(void)가 생략됨
//2. 함수를 만들 때 fun을 사용
//3. new를 사용하지 않고 예외를 throw
fun validateScoreIsNotNegative(score: Int){
    if (score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

//Java : if (0 <= score && score <= 100) {
//Kotlin : if (score in 0..100) {
fun validateScore(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

//if-else
//Java: Statement, Kotlin: Expression
//Statement: 프로그램의 문장, 하나의 값으로 도출되지 않음
//Expression: 하나의 값으로 도출되는 문장
//즉, expression이기 때문에 if를 통으로 return 가능 (kotlin에 삼항연산자가 없는 이유)
fun getPassOrFail(score: Int): String {
    return if (score >= 50){
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) "A"
    else if (score >= 80) "B"
    else if (score >= 70) "C"
    else "D"
}

fun getGradeWithWhen(score: Int): String {
    return when(score / 10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithWhen2(score: Int): String {
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

//조건부에는 어떠한 expression이라도 들어갈 수 있음(ex. is Type)
fun startsWithA(obj: Any): Boolean {
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

//조건부에서는 여러개의 조건을 동시에 검사할 수 있다(,로 구분)
fun judgeNumber(number: Int) {
    when(number){
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

//when(값), 값이 없을 수도 있다 - early return 처럼 동작
fun judgeNumber2(number: Int){
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
