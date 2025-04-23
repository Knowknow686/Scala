package com.io

import java.io.PrintWriter

// 定义一个名为 demo4 的对象
object demo4 {
  // 定义 main 方法，这是程序的入口点
  def main(args: Array[String]): Unit = {
    // 创建一个 PrintWriter 对象，用于向指定的文件写入数据
    // 文件路径为 "D:\\大数据\\下载\\io\\output.txt"
    var pw = new PrintWriter("D:\\大数据\\下载\\io\\output.txt")
    // 使用 println 方法向文件中写入字符串 "Hello Scala!"
    pw.println("Hello Scala!")
    // 再次使用 println 方法向文件中写入字符串 "hehe"
    pw.println("hehe")
    // 关闭 PrintWriter 对象，释放相关资源
    pw.close()
  }
}