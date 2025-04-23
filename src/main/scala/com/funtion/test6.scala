// 定义包名为 com.funtion
package com.funtion

// 定义一个名为 test6 的对象
object test6 {

  // 定义主方法，程序从这里开始执行
  def main(args: Array[String]): Unit = {
    // 创建一个字符串数组，包含 "java", "python", "scala", "idea"
    val arr = Array[String]("java", "python", "scala", "idea")
    
    // 调用自定义的 map 方法，将 arr 数组中的每个字符串转换为其长度
    // 使用匿名函数 x => x.length 作为操作符传递给 map 方法
    var resultarray = map(arr, x => x.length)
    
    // 遍历 resultarray 数组，并将每个元素（即字符串的长度）打印到控制台
    resultarray.foreach(println)
  }
  
  // 定义一个名为 map 的方法，该方法接受一个字符串数组和一个操作符
  // 操作符是一个函数，接受一个字符串并返回一个整数
  def map(arr: Array[String], operator: String => Int): Array[Int] = {
    // 使用 for 表达式遍历数组中的每个元素
    // 对每个元素应用操作符，并将结果收集到一个新的数组中
    // yield 关键字用于构建结果数组
    for (item <- arr) yield operator(item)
  }
}
