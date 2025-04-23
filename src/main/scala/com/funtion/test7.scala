package com.funtion

// 定义一个名为 test7 的对象
object test7 {
  // 定义 main 方法，作为程序入口点
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数 1 到 5 的数组
    val arr = Array[Int](1, 2, 3, 4, 5)

    // 使用 reduce 方法对数组进行累加，并打印结果
    // 这里使用了匿名函数 _+_ 来表示两个整数相加
    println(reduce(arr, _ + _))

    // 同样使用 reduce 方法对数组进行累加，并打印结果
    // 这里使用了显式定义的匿名函数 (x, y) => (x + y) 来表示两个整数相加
    println(reduce(arr, (x, y) => (x + y)))
  }

  // 定义一个名为 reduce 的方法，用于对数组进行某种操作
  // 输入参数为一个整数数组 arr 和一个二元函数 func
  def reduce(arr: Array[Int], func: (Int, Int) => Int) = {
    // 初始化结果为数组的第一个元素
    var result = arr(0)

    // 遍历数组的其余元素，从索引 1 开始
    for (i <- 1 until arr.length) {
      // 将当前的 result 和数组的当前元素传递给 func 函数
      // 并将返回的结果赋值给 result
      result = func(result, arr(i))
    }

    // 返回最终的结果
    result
  }
}
