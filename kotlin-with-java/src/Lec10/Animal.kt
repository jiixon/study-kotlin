package Lec10

abstract class Animal (
    protected val species: String,
    protected open val legCount: Int
){
    abstract fun move()
}
//custom getter 만들 때, 프로퍼티를 override를 해야할 경우 반드시 open을 붙여줘야함
//추상 프로퍼티가 아니라면, 상속받을 때 open을 붙여야함