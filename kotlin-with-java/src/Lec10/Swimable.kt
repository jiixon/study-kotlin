package Lec10

interface Swimable {

    val swimAbility: Int
        //get() = 3 //default 값

    fun act() {
        println("어푸 어푸")
    }

}