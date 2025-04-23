package com.funtion

import scala.collection.mutable.ArrayBuffer

object test8 {
  def main(args: Array[String]): Unit = {
    // 定义一个包含人员信息的数组，每项信息由姓名、性别和地址组成
    val arr = Array[String]("张三 男 深圳", "李四 女 深圳", "王五 男 北京", "李露 女 武汉")
    // 调用 getAddress 函数，传入数组 arr 和一个匿名函数，该函数用于提取每项信息中的地址部分
    var resultarray = getAddress(arr, x => x.split(" ")(2))
    // 将结果数组中的地址信息用逗号连接成一个字符串
    var resultnew = resultarray.mkString(",")
    // 打印最终的地址字符串
    println(resultnew)
  }

  // 定义一个函数 getAddress，它接受一个字符串数组和一个用于提取信息的函数
  def getAddress(arr: Array[String], func: String => String) = {
    // 创建一个可变的 ArrayBuffer 用于存储不重复的地址
    var result = ArrayBuffer[String]()
    // 遍历传入的数组 arr
    for (elem <- arr) {
      // 使用传入的函数 func 提取每项信息中的地址部分
      val key = func(elem)
      // 如果地址不在 result 中，则将其添加到 result 中
      if (result.contains(key) == false) {
        result += key
      }
    }
    // 返回包含不重复地址的 ArrayBuffer
    result
  }
}