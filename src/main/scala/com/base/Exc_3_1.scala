package com.base

object Exc_3_1 {
  def main(args: Array[String]): Unit = {
    // 定义一个字符串变量scalafile，存储文件名
    var scalafile = "demo.scala"
    // 找到文件名中"."的位置，并将索引值存储在indexnum变量中
    var indexnum = scalafile.indexOf(".")
    // 从"."的位置之后截取字符串，得到文件扩展名，并存储在endstr变量中
    var endstr = scalafile.substring(indexnum + 1)//substring(start)截取字符串
    // 定义一个布尔变量endstrboolean，初始值为true，用于判断文件扩展名是否为scala
    var endstrboolean = true
    // 判断文件扩展名是否为"scala"，如果不是，则将endstrboolean设置为false
    if (!endstr.equals("scala")) {
      endstrboolean = false
    }
    // 从文件名中截取第一个字符，并存储在firstchar变量中
    var firstchar = scalafile.substring(0, 1)//substring(start,end)截取字符串的子串
    // 定义一个布尔变量firstcharboolean，初始值为true，用于判断文件名的第一个字符是否为大写字母
    var firstcharboolean = true
    // 判断文件名的第一个字符是否为大写字母（A到Z），如果不是，则将firstcharboolean设置为false
    // 注意：这里原代码逻辑有误，应为firstchar >= "A" && firstchar <= "Z"
    if(!(firstchar >= "A" && firstchar <= "Z")) {
      firstcharboolean = false
    }
    // 如果文件扩展名不是scala或者文件名的第一个字符不是大写字母，则输出"文件名不合法！"
    // 否则，输出"文件名合法！"
    if(endstrboolean == false || firstcharboolean == false) {
      print("文件名不合法！")
    } else {
      print("文件名合法！")
    }
  }
}
