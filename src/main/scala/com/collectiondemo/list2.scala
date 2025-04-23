package com.collectiondemo

import org.omg.CosNaming.BindingListHelper  // 导入CosNaming包中的BindingListHelper类，但在这个代码中并未使用

object list2 {
  def main(args: Array[String]): Unit = {
    // 说明
    // 1. 在默认情况下，List是scala.collection.immutable.List，即不可变的
    // 2. 在Scala中，List是不可变的。如果需要使用可变的List，应该使用ListBuffer
    val list_1 = List(1, 2, 3)  // 创建一个包含元素1, 2, 3的不可变List
    println(list_1)  // 打印list_1的内容

    val list_2 = Nil  // 创建一个空的不可变List
    println(list_2)  // 打印list_2的内容

    // 访问List元素
    val value1 = list_1(1)  // 访问list_1的第二个元素（索引从0开始），即2
    println("value1=" + value1)  // 打印value1的值

    println("------------list 追加元素后的效果------------")
    var list1 = List(1, 2, 3, "abc")  // 创建一个包含元素1, 2, 3, "abc"的不可变List，并使用var声明以便后续修改
    val list2 = list1 :+ 4  // 使用:+操作符向list1追加元素4，生成一个新的List list2
    println(list1)  // 打印list1的内容，注意list1本身并未被修改，仍然是1, 2, 3, "abc"
    println(list2)  // 打印追加元素后的list2的内容，结果为1, 2, 3, "abc", 4
  }
}
