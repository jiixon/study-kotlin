package Lec16

open class Train (
    val name: String = "새마을 기차",
    val price: Int = 5_000,
)

fun Train.isExpensive() : Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

//확장함수 오버라이드
fun Srt.isExpensive() : Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}

fun main() {
    val train: Train = Train()
    train.isExpensive() //Train의 확장함수

    val str1: Train = Srt()
    str1.isExpensive() //Train의 확장함수

    val str2: Srt = Srt()
    str2.isExpensive() //Srt의 확장함수
}