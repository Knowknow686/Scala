package com.collectiondemo

// 定义一个名为 listdemo 的对象
object listdemo {
  // 定义 main 方法，作为程序的入口点
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数的列表 a
    val a = List(1, 2, 3, 0, 5, 0, 7)
    // 调用 removeZero 方法去除列表中的零，并打印结果
    println(removeZero(a))
  }

  // 定义一个名为 removeZero 的方法，用于从列表中移除所有零
  def removeZero(lst: List[Int]): List[Int] = {
    // 使用 filter 方法过滤掉列表中等于零的元素
    val mylist = lst.filter(_ != 0)
    // 返回过滤后的列表
    return mylist
  }
}
