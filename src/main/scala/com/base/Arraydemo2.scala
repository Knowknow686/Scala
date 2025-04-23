package com.base

import scala.language.postfixOps

object Arraydemo2 {
  def main(args: Array[String]): Unit = {
    // 定义一个包含整数的数组
    val a = Array(2, 3, 5, 7, 12)
    // 使用for循环遍历数组，步长为2，交换每两个相邻的元素
    for(i <- 0 until a.length - 1 by 2) {
      // 临时存储当前元素
      val tmp = a(i)
      // 将当前元素替换为下一个元素
      a(i) = a(i + 1)
      // 将下一个元素替换为临时存储的当前元素
      a(i + 1) = tmp
    }
    // 交换后输出数组中的每个元素
    for(x <- a)
      println(x)

    // 定义一个变量用于存储数组元素的总和
    var total = 0.0
    // 使用for循环逆序遍历数组，并将每个元素的值累加到total中
    for(i <- (0 to a.length - 1).reverse) {
      total += a(i)
    }
    // 输出数组元素的总和
    println("Total = " + total)
    // 输出数组元素的平均值
    println("Average = " + (total / a.length))
  }
}
