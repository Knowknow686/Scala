package com.base

/*字符串*/
object demo3 {
    def main(args: Array[String]): Unit = {
      //将字符串的第一个字母转为小写，第二个字母转为大写，并连接起来
      var str = "China"
      var strnew1 = str.substring(0 , 1).toLowerCase//substring(start, end)截取字符串，转小写
      var strnew2 = str.substring(1).toUpperCase//substring(start)截取字符串，转大写
      var strnew = strnew1.concat(strnew2)//concat(str)连接字符串
      println(strnew)
    }
}