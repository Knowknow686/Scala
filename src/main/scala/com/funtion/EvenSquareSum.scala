package com.funtion

// 定义一个名为 EvenSquareSum 的对象
object EvenSquareSum {
  // 主方法，程序入口
  def main(args: Array[String]): Unit = {
    // 创建一个包含1到10的整数列表
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // 调用 sumOfSquareOfEvens 方法计算偶数平方和，并将结果存储在 result 变量中
    val result = sumOfSquareOfEvens(numbers)
    // 打印结果到控制台
    println(result)
  }

  // 定义一个方法，用于过滤列表中的偶数
  def filterEvens(list: List[Int]): List[Int] = {
    // 使用 filter 方法保留列表中所有能被2整除的元素
    list.filter(_ % 2 == 0)
  }

  // 定义一个方法，用于计算列表中每个元素的平方
  def squareList(list: List[Int]): List[Int] = {
    // 使用 map 方法将列表中的每个元素平方
    list.map(x => x * x)
  }

  // 定义一个方法，用于计算偶数的平方和
  def sumOfSquareOfEvens(list: List[Int]): Int = {
    // 先调用 filterEvens 方法过滤偶数，然后调用 squareList 方法计算这些偶数的平方，最后使用 sum 方法计算平方的总和
    squareList(filterEvens(list)).sum
  }
}
