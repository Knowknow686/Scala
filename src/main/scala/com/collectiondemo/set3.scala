package com.collectiondemo

import scala.collection.mutable

object set3 {
  def main(args: Array[String]): Unit = {
    // 初始化一个空的可变的Int类型的Set
    var setvar = mutable.Set[Int]()
    // 当Set的大小小于10时，继续循环
    while (setvar.size < 10) {
      // 生成一个0到19之间的随机整数
      var n = (math.random * 20).toInt
      // 将随机整数添加到Set中，Set会自动去重
      setvar += n
    }
    // 打印Set的内容
    println(setvar)
  }

  // 初始化一个空的Int类型的List
  var listvar = List[Int]()
  // 当List的大小小于10时，继续循环
  while (listvar.size < 10) {
    // 生成一个0到19之间的随机整数
    var n = (math.random * 20).toInt
    // 如果List中不包含这个随机整数，则将这个整数添加到List的头部
    if (listvar.contains(n) == false) {
      listvar = n +: listvar
    }
  }
  // 打印List的内容
  println("list：" + listvar)
}