package com.oop

object Accounts {
  // 私有变量，用于存储当前的账户编号
  private var accountnumber = 10000

  // 定义一个方法来创建新的账户编号
  def createaccountnumber() = {
    // 每次调用时将账户编号加1
    accountnumber += 1
    // 返回新的账户编号
    accountnumber
  }

  // 主方法，程序的入口点
  def main(args: Array[String]): Unit = {
    // 循环10次，创建并打印10个新的账户编号
    for (i <- 1 to 10) {
      println("新账号：" + createaccountnumber())
    }
  }
}
