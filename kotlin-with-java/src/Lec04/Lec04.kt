package Lec04

fun main() {
    //비교 연산자 자바와 다른점
    //객체를 비교할때, 비교연산자를 사용하면 자동으로 compareTo 호출
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){ //compareTo 자동
        println("Money1이 Money2보다 금액이 큽니다")
    }

    //동등성, 동일성
    //동일성 ===, 동등성 == (자바: 동일성 ==, 동등성 equals)
    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)
    println(money3 === money4) //true
    println(money3 === money5) //false
    println(money3 == money5) //true(equals 오버라이딩)

    //Lazy 연산
    if(fun1() || fun2()) { //fun1(): true -> fun2()는 실행X
        println("본문")
    }

    //연산자 오버로딩
    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7) //Lec04.Money(amount=3000)
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}