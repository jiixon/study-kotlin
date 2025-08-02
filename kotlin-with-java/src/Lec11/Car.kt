package Lec11

class Car (
    internal val name: String, //1
    private var owner: String, //2
    _price: Int //생성자에 parameter
) {
    var price = _price //생성자에 들어간 price를 받아 넣어주는 세번째 프로퍼티
        private set //3

    //getter: name, owner, price
    //setter: owner, price

    //1. name에 대한 getter -> interanl
    //2. owner에 대한 getter,setter -> private
    //3. price에 대한 setter만 -> private (setter에만 추가로 가시성 부여가능)
}

