package com.oop

// 定义一个名为Accounts1的类
class Accounts1 {
  // 调用Accounts1对象的createaccountnumber方法生成账户ID，并将其赋值给accountid变量
  val accountid = Accounts1.createaccountnumber()
  // 定义一个私有变量balance，初始值为0.0，用于存储账户余额
  private var balance = 0.0

  // 定义一个存款方法，接受一个Double类型的参数amount
  def deposit(amount: Double) = {
    // 将传入的金额amount加到balance中
    balance += amount
    // 打印账户ID和当前余额
    println("账号："+accountid+"\t存款："+balance)
  }
}

// 定义一个名为Accounts1的对象（伴生对象）
object Accounts1 {
  // 定义一个私有变量accountnumber，初始值为1000，用于生成账户ID
  private var accountnumber = 1000

  // 定义一个方法createaccountnumber，用于生成新的账户ID
  def createaccountnumber() = {
    // 每次调用时将accountnumber加1
    accountnumber += 1
    // 返回新的accountnumber作为账户ID
    accountnumber
  }

  // 定义程序的入口点main方法，接受一个String数组参数args
  def main(args: Array[String]): Unit = {
    // 使用for循环创建10个Accounts1类的实例，并对每个实例调用deposit方法存入10元
    for (i <- 1 to 10) {
      var a = new Accounts1()
      a.deposit(10)
    }
  }
}
