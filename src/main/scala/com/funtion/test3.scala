package com.funtion

// 定义一个名为test3的对象
object test3 {
  // 定义一个名为sum的方法，该方法接受可变数量的Int类型的参数
  def sum(args: Int*) = {
    // 初始化一个变量result为0，用于存储累加的结果
    var result = 0
    // 遍历所有的参数arg，并将其累加到result中
    for (arg <- args) {
      result += arg
    }
    // 返回累加的结果result
    // 这里不需要使用return关键字，因为Scala方法的最后一个表达式的值会被自动返回
    result
  }

  // 定义main方法，作为程序的入口点
  def main(args: Array[String]): Unit = {
    // 调用sum方法，传入一组整数(1, 2, 3, 4, 5)，并将返回值存储在total变量中
    var total = sum(1, 2, 3, 4, 5)
    // 打印total变量的值
    println("total:" + total)
  }
}

