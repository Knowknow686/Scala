package com.base

object Exc_3_2 {
  def main(args: Array[String]): Unit = {
    // 定义一个字符串，包含多个子字符串"hello"
    var str = "sshelloworldhellojavahellojsp"
    // 初始化计数器，用于记录子字符串"hello"出现的次数
    var count = 0
    // 初始化索引，用于在字符串中查找子字符串的起始位置
    var index = 0
    // 定义要查找的子字符串
    var substr = "hello"
    // 查找子字符串"hello"在字符串str中的第一次出现位置
    index = str.indexOf(substr, index)
    // 当子字符串"hello"被找到时（即index != -1），进入循环
    while (index != -1) {
      // 每找到一次子字符串"hello"，计数器count加1
      count += 1
      // 更新索引index，跳过当前找到的子字符串"hello"，继续查找下一个
      index = index + substr.length()
      // 在更新后的索引位置开始查找下一个子字符串"hello"
      index = str.indexOf(substr, index)
    }
    // 输出子字符串"hello"在字符串str中出现的总次数
    println(count)
  }
}