package com.collectiondemo

// 定义一个名为list1的Scala对象
object list1 {
  // 主函数，程序的入口点
  def main(args: Array[String]): Unit = {
    // 创建一个包含整数1到5的列表
    val numbers = List(1, 2, 3, 4, 5)
    // 使用filter方法过滤出大于2的数字，并将结果存储在numfilter变量中
    var numfilter = numbers.filter(_ > 2)
    // 遍历numfilter列表并将每个元素打印到控制台
    numfilter.foreach(println(_))
    // 使用map方法将numbers列表中的每个数字乘以2，并将结果存储在doubledNumbers变量中
    val doubledNumbers = numbers.map(_ * 2)
    // 遍历doubledNumbers列表并将每个元素打印到控制台
    doubledNumbers.foreach(println(_))
    // 创建一个包含名字的列表
    var listname = List("John", "Mary", "Peter", "David")
    // 使用map方法在每个名字前加上字符串"name is"，并将结果存储在listmap变量中
    var listmap = listname.map("name is" + _)
    // 遍历listmap列表并将每个元素打印到控制台
    listmap.foreach(println(_))
    // 创建一个包含字符串的列表，每个字符串包含多个单词
    var listword = List("hello world","You Me")
    // 使用flatMap方法将每个字符串拆分为单词，并将所有单词组合成一个新的列表listwords
    var listwords = listword.flatMap(_.split(" "))
    // 遍历listwords列表并将每个单词打印到控制台
    listwords.foreach(println(_))

    // 使用zip方法将两个列表（名字列表和年龄列表）组合成一个元组列表
    var zipdemo = List("John", "Mary", "Peter", "David").zip(List(20, 25, 30, 35))
    // 遍历zipdemo列表并将每个元组打印到控制台
    zipdemo.foreach(println(_))
  }
}