package Lec14

fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        //else 작성 필요X
    }
}

//컴파일러가 country의 모든 타입을 알고 있음
// -> 다른 타입에 대한 로직(else) 작성 불필요 + enum 변화 알아챔

enum class Country (
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}