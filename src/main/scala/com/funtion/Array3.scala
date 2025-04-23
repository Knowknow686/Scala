package com.funtion

// 如何计算Array[Double]的平均值
object Array3 {
  // 主函数，程序入口
  def main(args: Array[String]) = {
    // 定义一个Double类型的数组a，包含一些示例数值
    val a = Array[Double](1, 4, 2, 10, 3, -1, -3)
    // 调用Avgarr函数计算数组a的平均值，并将结果存储在变量b中
    val b = Avgarr(a)
    // 打印出计算得到的平均值
    println(b)
  }

  // 计算Array[Double]平均值的函数
  def Avgarr(arr: Array[Double]) = {
    // 使用sum方法计算数组元素的总和，并除以数组长度以获得平均值
    arr.sum / arr.length
  }
}
