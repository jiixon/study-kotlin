package Lec15

fun main() {
    val array = arrayOf(100, 200)

    //index
    for(i in array.indices) {
        println("${i} ${array[i]}")
    }

    array.plus(300) //값 추가

    //index, value 한번에
    for((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    //컬렉션 - 불변/가변 지정 필수
    //(1)불변 리스트
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() //타입 명시 (추론 가능하면 생략가능)

    println(numbers[0])

    for(number in numbers) {
        println(number)
    }

    for((index, value) in numbers.withIndex()) {
        println("${index} ${value}")
    }

    //(2)가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)
    //tip - 우선 불변 리스트 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자

    //set
    val set = setOf(100, 200)
    val mutableSet = mutableSetOf(100, 200) //기본구현체 LinkedHashSet

    //map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY" //put도 가능
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY") //중위 호출

    for (key in oldMap.keys) {
        println("$key -> ${oldMap[key]}")
    }

    for((key, value) in oldMap) {
        println("$key -> $value")
    }

}