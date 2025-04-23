package io

import java.io.{BufferedWriter, FileWriter}  // 导入BufferedWriter和FileWriter类，用于文件写入操作
import scala.io.Source  // 导入Source类，用于文件读取操作

object WordCount1 {
  // 定义一个方法getWordCount，接收一个字符串列表，返回一个映射，其中键是单词，值是该单词在列表中出现的次数
  def getWordCount(word: List[String]): Map[String, Int] = {
    var mapcount = Map[String, Int]()  // 初始化一个空的映射，用于存储单词及其出现次数
    for (w <- word) {  // 遍历字符串列表中的每一个单词
      var count = mapcount.getOrElse(w, 0) + 1  // 获取当前单词的出现次数，如果单词不存在则默认为0，然后加1
      mapcount += (w -> count)  // 将更新后的单词及其计数添加到映射中
    }
    return mapcount  // 返回包含单词计数的映射
  }

  def main(args: Array[String]): Unit = {  // 定义程序入口点main方法
    val source = Source.fromFile("D:\\大数据\\下载\\io\\word.txt")  // 从指定路径读取文件内容
    val list: List[String] = source.getLines().toList  // 将文件中的每一行作为一个字符串，存入列表
    val wordList = list.flatMap(_.split(","))  // 将列表中每个字符串按逗号分割成单词，并展平成一个新的单词列表
    var mapstr = getWordCount(wordList)  // 调用getWordCount方法计算每个单词的出现次数，结果存储在映射中
    for ((k, v) <- mapstr) {  // 遍历映射中的每个键值对
      println("单词 " + k + " 出现次数 " + v)  // 打印单词及其出现次数
    }
    val bw = new BufferedWriter(new FileWriter("D:\\大数据\\下载\\io\\result.txt"))  // 创建一个BufferedWriter对象，用于写入结果文件
    for ((k, v) <- mapstr) {  // 再次遍历映射中的每个键值对
      bw.write("单词 " + k + " 出现次数 " + v + "\r\n")  // 将每个单词及其出现次数写入结果文件，每行一个单词
    }
    bw.flush()  // 刷新BufferedWriter，确保所有数据都被写入文件
    println("写入成功.....")  // 打印写入成功的消息
  }
}
