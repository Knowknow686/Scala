package com.funtion

import scala.collection.mutable.ArrayBuffer

object Array2 {
  // 定义一个方法 sigArr，接收一个整数数组作为参数，并返回一个新的整数数组
  def sigArr(arr: Array[Int]): Array[Int] = {
    // 创建一个可变的动态数组 buff，用于存储处理后的元素
    val buff = new ArrayBuffer[Int]()
    // 遍历输入数组 arr，筛选出所有大于 0 的元素，并将它们添加到 buff 中
    buff ++= (for(ele <- arr if ele > 0) yield ele)
    // 再次遍历输入数组 arr，筛选出所有等于 0 的元素，并将它们添加到 buff 中
    buff ++= (for(ele <- arr if ele == 0) yield ele)
    // 最后遍历输入数组 arr，筛选出所有小于 0 的元素，并将它们添加到 buff 中
    buff ++= (for(ele <- arr if ele < 0) yield ele)
    // 将动态数组 buff 转换为普通数组，并返回这个数组
    return buff.toArray
  }

  // 定义 main 方法，作为程序的入口点
  def main(args: Array[String]) = {
    // 创建一个整数数组 a，包含正数、负数和零
    val a = Array(1, -2, 0, -3, 1, 2)
    // 调用 sigArr 方法处理数组 a，并将结果存储在 newarray 中
    val newarray = sigArr(a)
    // 遍历并打印 newarray 中的每一个元素
    newarray.foreach(println)
  }
}
