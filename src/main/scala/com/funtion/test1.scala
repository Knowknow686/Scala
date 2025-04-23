package com.funtion

object test1 {
  //常规写法
//  def add(a: Int, b: Int): Int = {
//    var sum = a + b
//    return sum//return语句可以省略,返回类型是之前声明的类型Int
//  }

  //简化写法
  def addInt(a: Int, b: Int) = a + b

  def main(args: Array[String]): Unit = {
    var n = addInt(3, 6)
    var m = addInt(b=3, a=6)
    print("n=" + n)
  }
}