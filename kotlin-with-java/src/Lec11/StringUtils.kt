package Lec11

fun isDirectoryPath(path: String) : Boolean {
    return path.endsWith("/")
}
//파일 최상단에 바로 유틸 함수 작성 -> abstract class + private constructor로 인스턴스화 막음과 비슷한 기능