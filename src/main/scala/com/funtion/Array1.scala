package com.funtion

//编写一个函数，将整数数组中相邻的元素置换
//例如，给定数组[1,2,3,4,5]，函数应该返回[2,1,4,3,5]。
object Array1 {
  //程序入口点，程序从这里开始执行
  def main (args: Array[String]): Unit = {
    //定义一个整数数组 a，初始值为 [1,2,3,4,5]
    val a = Array(1,2,3,4,5)
    //调用 Swap 函数，传入数组 a 作为参数
    Swap(a)
    //使用 foreach 方法遍历数组 a 的每个元素，并打印出来
    a.foreach(print)
  }

  //交换函数，接收一个整数数组作为参数
  //该函数会将数组中相邻的元素进行交换
  def Swap(arr: Array[Int]): Unit = {
    //遍历数组，步长为 2，这样每次循环处理的是数组中两两相邻的元素
    //注意：原代码中的 `for(i <- 0 until  (arr.length-1, 2))` 存在语法错误，应改为 `for(i <- 0 until arr.length - 1 by 2)`
    for(i <- 0 until arr.length - 1 by 2) {
      //将当前索引 i 的元素与下一个索引 i+1 的元素进行交换
      val temp = arr(i)
      arr(i) = arr(i+1)
      arr(i+1) = temp
    }
  }
}
