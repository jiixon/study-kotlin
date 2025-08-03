package com.group.libraryapp.calculator

import org.junit.jupiter.api.Assertions.*

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest2()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}
class CalculatorTest {

    //calculator, expectedCalculator 값 비교시 Calculator 클래스의 number를 가져와서 확인해야함
    //1) Calculator 클래스 -> data class로 수정
    //2) Calculator 클래스 -> private number:Int에서 private 지우기

    //1)
//    fun addTest1() {
//        //given
//        val calculator = Calculator(5)
//
//        //when
//        calculator.add(3)
//
//        //then
//        val expectedCalculator = Calculator(8)
//        if(calculator != expectedCalculator) {
//            throw IllegalArgumentException()
//        }
//    }

    //2)
    fun addTest2() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if(calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }

    //2)의 경우, public으로 변수 열어두기 꺼리는 경우(외부에서 setter 사용될수 있기 때문에)
    //class + private으로 바꾸고 number -> _number 로 변수 수정
    //val number:Int
    //  get() = this._number
    //위처럼 private으로 외부막고, custom getter로 getter만 열어주기

    fun minusTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if(calculator.number != 2) {
            throw IllegalArgumentException()
        }

    }

    fun multiplyTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if(calculator.number != 15) {
            throw IllegalArgumentException()
        }

    }

    fun divideTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if(calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest() {
        //given
        val calculator = Calculator(5)

        //then
        try {
            calculator.divide(0)
        } catch (e: ArithmeticException) {
            //테스트 성공
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }
        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }
}