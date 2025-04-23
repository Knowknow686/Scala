package com.funtion

// 定义一个名为test9的对象
object test9 {
  // 定义main函数，程序从这里开始执行
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数的数组
    val arr = Array[Int](10, 2, 4, 6, 1, 81, 13)

    // 打印出数组中所有能被2整除的元素，并将其转换为Buffer格式
    println(filter(arr, x => x % 2 == 0).toBuffer)
    // 打印出数组中所有能被3整除的元素，并将其转换为Buffer格式
    println(filter(arr, x => x % 3 == 0).toBuffer)
  }

  // 定义一个名为filter的函数，接受一个整数数组和一个布尔函数作为参数
  def filter(arr: Array[Int], func: Int => Boolean): Array[Int] = {
    // 使用for-comprehension遍历数组，并根据布尔函数筛选元素
    for (elem <- arr if func(elem)) yield
      // 将筛选出的元素转换为Int类型并返回
      elem.toInt
  }
}