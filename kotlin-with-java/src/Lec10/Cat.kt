package Lec10

class Cat (
    species: String,
) : Animal(species, 4){
    //상속받을 때, extends 키워드 대신 : 사용
    //상위클래스의 생성자를 바로 호출

    //override 붙여서 필수적
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}