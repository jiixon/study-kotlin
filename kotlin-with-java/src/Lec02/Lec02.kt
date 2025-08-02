package Lec02

fun main() {

    //?. - Safe Call, null이 아니면 실행 null이면 실행하지않고 그대로 null
    val str: String? = "ABC"
    println(str?.length) //3

    val str2: String? = null
    println(str2?.length) //null

    //?: - Elvis 연산자, 앞의 연산결과가 null이면 뒤의 값을 사용
    val str3: String? = null
    println(str3?.length ?: 0) //0

    //!! - 반드시 null이 아님 단언
    //이 경우, 컴파일에러는 안나지만 null을 넣으면 런타임 에러 발생
    //정말 null이 아닌게 확실한 경우에만 사용
//    println(startsWithA4(null))
    println(startsWithA4("aaa"))

    //플랫폼 타입 : 코틀린이 null 관련 정보를 알 수 없는 타입, runtime시 exception 발생 가능
    //@Nullable 이 없다면 -> kotlin에서 이 값이 null 관련 정보를 알 수 없음
    val person = Person("공부하는 개발자")
    startsWithA(person.name) //@Nullable -> @NotNull로 바꿔야 가능, startsWithA param이 null 불가능이기 떄문

}

fun startsWithA(str: String) : Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    if (str == null){
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA1New(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null){
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2New(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null){
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3New(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}
