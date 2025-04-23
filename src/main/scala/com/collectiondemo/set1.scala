package com.collectiondemo

import scala.collection.mutable

object set1 {
  def main(args: Array[String]): Unit = {
    // 创建一个可变集合Set，并初始化包含元素1, 2, "hello"
    val mutableSet = mutable.Set(1, 2, "hello")
    // 打印当前的mutableSet内容
    println("mutableSet:" + mutableSet)

    // 向mutableSet中添加元素4
    mutableSet.add(4)
    // 使用+=操作符向mutableSet中添加元素6
    mutableSet += 6
    // 使用+=操作符向mutableSet中添加元素5
    mutableSet.+=(5)
    // 打印添加元素后的mutableSet内容
    println("mutaableSet" + mutableSet)

    // 创建另一个可变集合Set，并初始化包含元素1, 2, 4, "abc"
    val set_2 = mutable.Set(1, 2, 4, "abc")
    // 使用-=操作符从set_2中移除元素2
    set_2 -= 2
    // 使用remove方法从set_2中移除元素"abc"
    set_2.remove("abc")
    // 打印移除元素后的set_2内容
    println("set_2" + set_2)

    // 创建第三个可变集合Set，并初始化包含元素1, 2, 4, "abc"
    val set_3 = mutable.Set(1, 2, 4, "abc")
    // 打印set_3的长度
    println("长度：" + set_3.size)
    // 遍历set_3中的每个元素并打印
    for (x <- set_3) {
      println(x)
    }
  }
}