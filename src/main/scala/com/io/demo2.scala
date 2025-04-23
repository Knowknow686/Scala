package com.io

import scala.io.{BufferedSource, Source}

// 定义一个名为 demo2 的对象
object demo2 {
  // 定义程序的入口点
  def main(args: Array[String]): Unit = {
    // 从指定文件路径创建一个 BufferedSource 实例，这里指定的文件路径是 "D:\\io\\user.txt"
    val source: BufferedSource = Source.fromFile("D:\\大数据\\下载\\io\\user.txt")
    // 获取文件内容的迭代器
    val iter = source.buffered
    // 当迭代器还有下一个元素时，循环继续
    while (iter.hasNext) {
      // 读取下一个元素（这里是文件的每一行）
      val data = iter.next()
      // 打印读取到的数据
      println(data)
    }
    // 关闭文件源，释放资源
    source.close()
  }
}