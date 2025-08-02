package Lec14

fun main() {
    val dto1 = PersonDto("지원", 100)
    val dto2 = PersonDto("지원", 100)
    println(dto1 == dto2) //true -> equals
    println(dto1) //PersonDto(name=지원, age=100) -> toString
}

data class PersonDto (
    val name: String,
    val age: Int
)

//프로퍼티 선언 -> getter, setter 생성
//data class -> equals, hashCode, toString 자동 생성