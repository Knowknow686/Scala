import scala.io.StdIn.readLine

// 定义 BankAccount 类
class BankAccount(initialBalance: Double) {
  // 私有变量：余额
  private var balance: Double = initialBalance
  // 存款方法
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"存钱成功，存入金额为：$amount，当前余额为：$balance")
    } else {
      println("存款金额必须大于零！")
    }
  }

  // 取款方法
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"取钱成功，取出金额为：$amount，当前余额为：$balance")
    } else {
      println("取款失败，余额不足！")
    }
  }

  // 查询余额方法
  def checkBalance(): Unit = {
    println(s"当前余额：$balance")
  }

  // 账户余额
  def getBalance(): Double = balance
}


object BankAccount {
  // 主函数
  def main(args: Array[String]): Unit = {
    // 创建一个银行账户对象，初始余额为0
    val account = new BankAccount(0)

    var choice: String = ""

    while (true) {
      // 显示菜单
      println("欢迎来到本银行办理业务")
      println("1. 存款  2. 取款  3. 查询余额   0. 退出")
      print("请选择你需要办理的业务：")

      // 获取用户输入
      choice = readLine()

      choice match {
        case "1" => // 存款
          print("请输入存款金额：")
          val depositAmount = readLine().toDouble
          account.deposit(depositAmount)

        case "2" => // 取款
          print("请输入取款金额：")
          val withdrawAmount = readLine().toDouble
          account.withdraw(withdrawAmount)

        case "3" => // 查询余额
          account.checkBalance()

        case "0" => // 退出
          println("谢谢使用！")
          return

        case _ =>
          println("输入错误，请重新选择！")
      }
    }
  }
}