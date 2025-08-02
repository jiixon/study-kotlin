package Lec04

data class Money (
    val amount: Long
){
    operator fun plus(another: Money): Money {
        return Money(this.amount + another.amount)
    }
}