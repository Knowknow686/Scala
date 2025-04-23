package com.funtion

object Lamddemo1 {
  def main(args: Array[String]): Unit = {
    // 定义一个高阶函数，接收一个函数和一个整数作为参数
    // 高阶函数可以接收函数作为参数，或返回一个函数
    def applyFunction(f: Int => Int, x: Int): Int = {
      // 将传入的函数 f 应用于整数 x，并返回结果
      f(x)
    }

    // 定义一个函数，将输入的整数乘以3
    def multiplyByThree(x: Int): Int = {
      // 返回 x 乘以 3 的结果
      x * 3
    }

    // 调用高阶函数 applyFunction，传入 multiplyByThree 函数和整数 5
    // applyFunction 将 multiplyByThree 作用于 5，并将结果赋值给变量 result
    val result = applyFunction(multiplyByThree, 5)
    // 输出变量 result 的值，根据上述计算，结果应为 15
    println(result) // 输出15
  }
}
