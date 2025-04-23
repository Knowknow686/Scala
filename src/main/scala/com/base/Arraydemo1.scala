package com.base
// 导入 Array 对象中的方法
import Array._

object Arraydemo1 {
  def main(args: Array[String]): Unit = {
    // 定义一个整数数组 a，包含元素 2, 3, 5, 7, 11
    var a = Array(2, 3, 5, 7, 11)
    // 使用 for 循环遍历数组 a 的每个元素，并打印出来
    for(i <- 0 to (a.length-1)) {
      print(a(i))
    }

    // 使用 for-yield 表达式遍历数组 a 的每个元素，将每个元素乘以 2，并生成一个新的数组 result
    val result = for(elem <- a) yield 2*elem
    // 遍历并打印 result 数组中的每个元素
    for(x <- result)
      println(x)

    var result1 = for(elem <- a if elem%2 == 0) yield 2*elem
    for(x <- result1)
      println(x)

    // 使用 range 方法生成一个从 10 到 20（不包括 20），步长为 2 的整数数组 myList1
    var myList1 = range(10, 20, 2)
    // 使用 range 方法生成一个从 10 到 20（不包括 20）的整数数组 myList2
    var myList2 = range(10, 20)
    // 输出所有 myList1 数组元素，元素之间用空格分隔
    for(x <- myList1) {
      print(" " + x)
    }
    println() // 换行
    // 输出所有 myList2 数组元素，元素之间用空格分隔
    for(x <- myList2) {
      print(" " + x)
    }
    println() // 换行
    // 定义两个浮点数数组 myList3 和 myList4
    var myList3 = Array(1.9, 2.9, 3.4, 3.5)
    var myList4 = Array(8.9, 7.9, 0.4, 1.5)
    // 使用 concat 方法将 myList3 和 myList4 连接成一个新的数组 myList5
    var myList5 = concat(myList3, myList4)
    // 输出所有 myList5 数组元素
    for(x <- myList5) {
      print(x)
    }
    // 定义一个整数数组 arrayvar
    var arrayvar = Array(7,4,9,10,8)
    // 使用 java.util.Arrays.sort 方法对 arrayvar 数组进行排序
    java.util.Arrays.sort(arrayvar)
    // 遍历并打印已排序的 arrayvar 数组中的每个元素
    arrayvar.foreach(println)
  }
}
