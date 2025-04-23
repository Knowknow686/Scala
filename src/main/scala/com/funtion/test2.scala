package com.funtion


object test2 {
  //求数组中最小数
  def min(values: Array[Int]) = values.min
  def signum(n: Int) = {
    if (n > 0)
      1
    else if (n < 0)
      -1
    else
      0
  }
  //打印语句
  def printMe() = println("Hello, world!")
  def main(args: Array[String]): Unit = {
    var arraydemo = Array(2, 4, 6, 8)
    //调用函数
    var minValue = min(arraydemo)
    println("The minimum value in the array is: " + minValue)
    //调用函数
    var num = signum(4)
    println(num)
    //调用打印函数
    printMe()
  }
}
