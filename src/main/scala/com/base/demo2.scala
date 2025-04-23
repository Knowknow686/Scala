package com.base

import scala.io.StdIn
import scala.language.postfixOps

//输入两个数字，并求和，并判断哪个数字大
object demo2 {
  def main(args: Array[String]): Unit = {
    print("请输入一个数字：")
    val number1 = StdIn.readInt()
    print("请输入另一个数字：")
    val number2 = StdIn.readInt()

    println("两数之和为：" + (number1 + number2))
    val sum = number1 + number2
    println("两数之和为：" + sum)

    /*if-else语句*/
    if (number1 > number2) {
      println(number1 + "大于" + number2)
    }else{
      println(number2 + "大于" + number1)
    }

    /*for语句、有关to、until、by、reverse(颠倒顺序)、yield等方法*/
    print("to的写法：")
    for (a <- 1 to 10) {
      print(a + "\t")
    }
    println()//换行,或者print("\n")、printf("\n")

    print("until的写法：")
    for(a <- 1 until 10) {
      print(a + "\t")
    }
    println()

    print("反向by的写法：")
    for(a <- 10 to 1 by -1) {
      print(a + "\t")
    }
    println()

    print("反向reverse的写法：")
    for(a <- 1 to 10 reverse)
      print(a + "\t")
    println()

    val numList = List(1, 2, 3, 4, 5,6)
    //for语句遍历列表
    print("Value of a is:")
    for(a <- numList) {
      print(a + "\t")
    }
    println()

    //常规写法
    print("偶数写法一：")
    for(a <- numList) {
      if(a % 2 == 0) {
        print(a + "\t")
      }
    }
    println()

    //高级写法
    print("偶数写法二：")
    for(a <- numList if a % 2 == 0) {
      print(a + "\t")
    }
    println()

    //yield语句
    print("乘以2的新列表：")
    val newList = for(a <- numList) yield a * 2
    for(a <- newList) {
      print(a + "\t")
    }
    println()

    //集合过滤，用if语句过滤掉3、8、9、10，for语句遍历过滤后的集合
    print("新集合元素过滤：")
    val Listfor = List(1,2,3,4,5,6,7,8,9,10)
    val retval = for(a <- Listfor if a!= 3 && a!= 8 &&a!= 9 &&a!= 10) yield a
    for(a <- retval) {
      print(a + "\t")
    }
    println()
    println("程序结束")


  }
}