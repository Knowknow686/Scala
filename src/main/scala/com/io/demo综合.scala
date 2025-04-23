package com.io

// 导入必要的IO类和异常处理类
import java.io.{BufferedWriter, FileWriter, IOException}
import scala.io.Source

// 定义一个对象demo综合，包含学生的数据处理逻辑
object demo综合 {
  // 定义一个case class Student，包含学生的姓名和三门课程的成绩
  case class Student(name: String, chinese: Int, math: Int, english: Int) {
    // 定义一个方法getSum，计算三门课程的总分
    def getSum(): Int = chinese + math + english
  }

  // 定义main方法，程序的入口
  def main(args: Array[String]): Unit = {
    try {
      // 从指定路径读取学生信息文件
      val source = Source.fromFile("D:\\大数据\\下载\\io\\student.txt")
      // 将文件的每一行数据转换为Student对象的列表
      val studentList = source.getLines()
        .map(_.split(" ")) // 按空格分割每行数据
        .map(arr => Student(arr(0), arr(1).toInt, arr(2).toInt, arr(3).toInt)) // 将分割后的数据转换为Student对象
        .toList // 转换为列表

      // 按总分降序排序学生列表
      val sortList = studentList.sortBy(_.getSum()).reverse

      // 创建BufferedWriter对象，用于将排序后的学生信息写入文件
      val bw = new BufferedWriter(new FileWriter("D:\\大数据\\下载\\io\\student_sort.txt"))
      // 遍历排序后的学生列表，并将每个学生的信息及其总分写入文件
      sortList.foreach(s => bw.write(s"${s.name} ${s.chinese} ${s.math} ${s.english} ${s.getSum()}\r\n"))

      // 刷新并关闭BufferedWriter对象
      bw.flush()
      bw.close()
      // 关闭读取的学生信息文件源
      source.close()
    } catch {
      // 捕获并处理IO异常
      case e: IOException =>
        println(s"发生IO错误: ${e.getMessage}")
      // 捕获并处理数据格式异常
      case e: NumberFormatException =>
        println(s"数据格式错误: ${e.getMessage}")
      // 捕获并处理其他异常
      case e: Exception =>
        println(s"发生错误: ${e.getMessage}")
    }
  }
}