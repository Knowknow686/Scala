package com.collectiondemo

object set2 {
  def main(args: Array[String]): Unit = {
    // 创建一个包含字符串"Hadoop"和"Spark"的可变Set集合
    var myset = Set[String]("Hadoop", "Spark")
    // 打印初始的myset集合内容
    println(myset)
    // 向myset集合中添加一个新的元素"Scala"
    myset += "Scala"
    // 打印添加元素后的myset集合内容
    println(myset)
    // 打印集合myset的元素个数
    println("集合元素个数：" + myset.size)

    // 创建一个包含整数1, 2, 3的可变Set集合
    var set1 = Set[Int](1, 2, 3)
    // 向set1集合中添加一个新的元素6
    set1 += 6
    // 打印set1集合中添加元素4后的结果（注意：这里并未真正修改set1，而是创建了一个新的Set）
    println(set1 + 4)
    // 打印set1集合中移除元素1后的结果（注意：这里并未真正修改set1，而是创建了一个新的Set）
    println(set1 - 1)
    // 打印set1集合的实际内容（未被上述操作改变）
    println(set1)
    // 计算并打印set1集合中大于1的元素个数
    println(set1.count(_ > 1))
  }
}