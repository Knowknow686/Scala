package com.io

import java.io.FileOutputStream

// 定义一个名为 demo3 的对象
object demo3 {
  // 定义程序的入口点
  def main(args: Array[String]): Unit = {
    // 创建一个 FileOutputStream 对象，用于写入文件 "D:\\大数据\\下载\\io\\output.txt"
    val fileOutputStream = new FileOutputStream("D:\\大数据\\下载\\io\\output.txt")
    // 向文件中写入字符串 "Hello World\n" 的字节数组
    fileOutputStream.write("Hello World\n".getBytes)
    // 向文件中写入字符串 "hehe" 的字节数组
    fileOutputStream.write("hehe".getBytes)
    // 关闭 FileOutputStream，以释放系统资源
    fileOutputStream.close()
  }
}