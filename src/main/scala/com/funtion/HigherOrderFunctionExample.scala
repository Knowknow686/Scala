// 定义包名为 com.funtion
package com.funtion

// 定义对象 HigherOrderFunctionExample
object HigherOrderFunctionExample {
  // 主函数，程序的入口点
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数 1 到 5 的列表
    val numbers = List(1, 2, 3, 4, 5)

    // 调用 operateOnList 函数，将每个元素加 1，并将结果存储在 incremented 变量中
    val incremented = operateOnList(_ + 1, numbers)
    // 打印 incremented 列表
    println(incremented)

    // 调用 operateOnList 函数，将每个元素平方，并将结果存储在 squared 变量中
    val squared = operateOnList(x => x * x, numbers)
    // 打印 squared 列表
    println(squared)
  }

  // 定义一个高阶函数 operateOnList，它接受一个函数 f 和一个整数列表 list 作为参数
  // 返回一个新的列表，其中每个元素都是原列表中对应元素经过函数 f 处理后的结果
  def operateOnList(f: Int => Int, list: List[Int]): List[Int] = {
    // 使用 map 方法对列表中的每个元素应用函数 f，并返回新的列表
    list.map(f)
  }
}

