package com.collectiondemo

object map3 {
  def main(args: Array[String]): Unit = {
    // 创建一个包含水果及其价格的Map
    val prices = Map("apple" -> 1.5, "banana" -> 0.7, "orange" -> 2.0)
    // 使用for表达式遍历prices Map，并将每个水果的价格打九折生成新的Map
    val newprices = for((k, v) <- prices) yield (k, v * 0.9)
    // 遍历newprices Map，打印每个水果及其打折后的新价格
    for((k, v) <- newprices) {
      println(k + ":" + v)
    }
    // 创建一个包含符号的数组
    val symbols = Array("<", "-", ">")
    // 创建一个包含数量的数组
    val counts = Array(2, 10, 5)
    // 使用zip方法将symbols数组和counts数组组合成一个包含元组的数组
    val pairs = symbols.zip(counts)
    // 遍历pairs数组，打印每个符号重复相应数量的字符串
    for((k, v) <- pairs) {
      println(k * v)
    }
  }
}
