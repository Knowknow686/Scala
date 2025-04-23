package com.base

// 定义一个名为Exc_2的对象，包含主方法
object Exc_2 {
  // 主方法，程序入口点
  def main(args: Array[String]): Unit = {
    // 定义一个字符串变量str，并初始化为"chinasoft"
    var str ="chinasoft"
    // 打印字符串str及其长度
    print(str+"长度:"+str.length()+"\n")
    // 打印字符's'在字符串str中的索引位置
    print(str.indexOf("s")+"\n")
    // 打印从索引2开始到字符串str末尾的子字符串
    print(str.substring(2)+"\n")
    // 打印从索引2开始到索引5（不包括索引5）的子字符串
    print(str.substring(2,5)+"\n")
    // 定义一个包含空格的字符串变量str2，并初始化为"a b c d"
    var str2 = "a b c d"
    // 打印去除字符串str2首尾空格后的结果
    print(str2.trim+"\n")
    // 打印将字符串str2中的所有空格替换为空字符串后的结果
    print(str2.replace(" ",""))
    print("\n")



    // 定义字符串s，包含小写字母、大写字母和数字
    var s = "abcAdfsdf23217sfGFHJa5cA"
    //a-z小写字母,A-Z大写字母,0-9数字
    var smallCount = 0
    var bigCount = 0
    var numberCount = 0
    for (i <- 0 to s.length-1) {
      //根据索引i获得对应的每个元素
      var ch = s.charAt(i)
      //判断该字符到底是属于哪一种类型的
      if (ch >= 'a' && ch <= 'z') {
        smallCount += 1
      } else if (ch >= 'A' && ch <= 'Z') {
        bigCount += 1
      } else if (ch >= '0' && ch <= '9') {
        numberCount += 1
      }
    }
    // 输出小写字母、大写字母和数字的数目
    println("小写字母数目："+smallCount)
    println("大写字母数目："+bigCount)
    println("数字数目："+numberCount)
  }
}