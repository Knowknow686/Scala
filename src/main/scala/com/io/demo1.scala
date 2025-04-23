package com.io

import scala.io.{BufferedSource, Source}

object demo1 {
  def main(args: Array[String]): Unit = {
    // 从指定路径的文件创建一个BufferedSource对象
    val source: BufferedSource = Source.fromFile("D:\\大数据\\下载\\io\\user.txt")
    // 获取文件的所有行，返回一个Iterator[String]
    val lines = source.getLines()
    // 将Iterator转换为List，以便于后续处理
    val list = lines.toList
    // 遍历List中的每一行，并打印到控制台
    list.foreach(println)
    // 关闭BufferedSource以释放资源
    source.close()
  }
}