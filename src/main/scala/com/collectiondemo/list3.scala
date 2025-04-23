package com.collectiondemo

object list3 {
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数1, 2, 3的列表
    var intlist = List(1, 2, 3)
    // 使用foreach方法遍历列表并打印每个元素
    intlist.foreach(println)
    // 使用for循环遍历列表并打印每个元素
    for (s <- intlist) {
      println(s)
    }
    // 使用for循环和索引遍历列表并打印每个元素
    for (i <- 0 to intlist.size - 1) {
      println(intlist(i))
    }
    // 检查列表中是否包含数字4，并打印结果（True或False）
    println(intlist.contains(4))
    // 打印列表中所有不同元素。由于列表中没有重复元素，所以输出结果与原列表相同
    println(intlist.distinct)
    // 打印列表中所有大于1的元素
    println(intlist.filter(_ > 1))
    // 在列表的开头添加数字2，并打印新的列表
    var newlist = 2 +: intlist
    println("newlist: " + newlist)
    // 初始化变量sum为0，用于存储列表中所有元素的和
    var sum = 0
    // 使用for循环遍历列表的索引，累加每个元素的值到sum
    for (s<- 0 to intlist.length-1) {
      sum += intlist(s)
    }
    // 打印使用for循环计算的列表元素的和
    println(sum)
    // 打印使用sumlist函数计算的列表元素的和
    println(sumlist(intlist))
  }
  // 定义一个递归函数sumlist，用于计算列表中所有元素的和
  def sumlist(lst: List[Int]): Int = {
    // 如果列表为空，返回0；否则，返回列表头元素与剩余部分递归调用的和
    if (lst == Nil)
      0
    else lst.head + sumlist(lst.tail)
  }
}