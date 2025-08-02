package Lec12

fun main() {
    //익명클래스 - object : 타입이름 + 중괄호
    moveSomething(object : Moveable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")        }
    })
}

private fun moveSomething(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}