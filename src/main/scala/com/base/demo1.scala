package com.base

import scala.io.StdIn

object demo1 {
  def main(args: Array[String]):Unit = {
    /*var为变量，val为常量。常量的值不能被修改，变量的值可以被修改。*/
    /*var为可变变量，val为不可变变量。不可变变量的值一旦初始化后，不能被修改。*/
    val name ="WuBangxin"
    var age =20
    var state =""
    var price =26.66f
    val url = "https://www.baidu.com"
    var flag = true

    age+=1//变量的值可以被修改
    price+=1f//变量的值可以被修改

    print("请输入一个浮点数：")
    val aa = StdIn.readFloat()//读取输入的浮点数
    println(aa)

    /*if-else语句*/
    //常规写法
    if(age>=18) {
      state="成年"
    }else {
      state="未成年"
    }
    println("state=" + state)
    //简化写法
    state =if(age>=18) "成年" else "未成年"
    println("state=" + state)

    println("name="+name+",age="+age+",url="+url)
    //格式说明符，如%d,%i,%f，%s等。C语言格式输出
    printf("姓名：%s,年龄：%d,网址：%s",name,age,url)
    printf("\n姓名：%s,价格：%.2f,网址：%s",name,price,url)
  }
}