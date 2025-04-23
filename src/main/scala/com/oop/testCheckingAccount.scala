package com.oop

// 定义一个银行账户类，初始余额为0.0
class BankAccount1(var balance: Double = 0.0) {
  // 存款方法，存款金额不能为负数
  def deposit(money: Double): Double = {
    if (money < 0) throw new IllegalArgumentException("存入金额不能为负数")
    balance += money
    println("存钱成功------------")
    balance
  }

  // 取款方法，取款金额不能为负数，且账户余额不能小于取款金额
  def withdraw(value: Double): Double = {
    if (value < 0) throw new IllegalArgumentException("取出金额不能为负数")
    if (balance - value < 0) {
      println("余额不足-----------")
    } else {
      balance -= value
      println("取钱成功------------")
    }
    balance
  }

  // 查询余额方法
  def searchbalance: Double = balance
}

// 定义一个支票账户类，继承自BankAccount1，并重写存款和取款方法
class CheckingAccount(initialBalance: Double) extends BankAccount1(initialBalance) {
  // 重写的存款方法，存款时会扣除1元手续费
  override def deposit(amount: Double): Double = super.deposit(amount - 1)

  // 重写的取款方法，取款时会扣除1元手续费
  override def withdraw(amount: Double): Double = super.withdraw(amount - 1)
}

// 定义一个测试支票账户的伴生对象
object testCheckingAccount {
  // 主方法，程序的入口
  def main(args: Array[String]): Unit = {
    // 创建一个新的支票账户实例，初始余额为0.0
    val ca = new CheckingAccount(0.0)

    try {
      // 存入100元
      ca.deposit(100.0)
      // 输出当前余额
      println("当前余额：" + ca.searchbalance)

      // 取出50元
      ca.withdraw(50.0)
      // 输出当前余额
      println("当前余额：" + ca.searchbalance)
    } catch {
      // 捕获并处理非法参数异常
      case e: IllegalArgumentException => println("操作失败: " + e.getMessage)
    }
  }
}
