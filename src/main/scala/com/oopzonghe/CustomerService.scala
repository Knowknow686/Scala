package com.oopzonghe

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import util.control.Breaks._

class CustomerService {
  // 创建两个Customer对象实例
  val customer1 = new Customer(1, 18, "tom", '男', "14725836995", "tom@qq.com")
  val customer2 = new Customer(2, 18, "jac", '男', "15869951472", "jac@qq.com")

  // 使用可变ListBuffer来存储Customer对象
  var customerInfo = new ListBuffer[Customer]()
  // 初始化下一个客户的编号
  var customerId = 3

  // 将创建的Customer对象添加到ListBuffer中
  customerInfo.append(customer1)
  customerInfo.append(customer2)

  // 打印所有客户的列表信息
  def getCustomerInfo(): Unit = {
    println("客户列表：")
    println("编号\t\t年龄\t\t姓名\t\t性别\t\t电话\t\t邮箱")
    for (customer <- customerInfo) {
      println(customer.toString)
    }
    println("客户列表显示完毕。。。\n。。。。。。。。。。。。。。。。")
  }

  // 添加新的客户信息到列表中
  def addCustomerInfo(): Unit = {
    println("添加客户：")
    println("请依次输入用户信息：")
    println("姓名：")
    val name = StdIn.readLine()
    println("年龄：")
    val age = StdIn.readShort()
    println("性别：")
    val gender = StdIn.readChar()
    println("电话：")
    val tel = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()
    // 创建新的Customer对象并添加到customerInfo中
    val customer = new Customer(customerId, age, name, gender, tel, email)
    customerId += 1
    customerInfo.append(customer)
    println("添加客户信息完成！\n")
  }

  // 删除指定编号的客户信息
  def delCustomerInfo(): Unit = {
    println("删除客户操作：")
    println("请选择待删除客户编号(-1退出):")
    val id = StdIn.readInt()
    if (id == -1) {
      println("退出删除操作")
      return
    }
    println("请确认是否删除(Y/N):")
    var choice = ' '
    // 使用breakable来控制循环，直到用户输入有效的确认字符
    breakable {
      do {
        choice = StdIn.readChar().toLower
        if (choice == 'Y' || choice == 'N') {
          break()
        }
      } while (true)
    }

    // 根据用户确认决定是否调用del方法删除客户
    if (choice == 'Y') {
      if (del(id)) {
        println("删除完成！")
        return
      }
    }

    println("删除失败！")
  }

  // 根据编号查找客户并删除，返回删除是否成功
  def del(id: Int): Boolean = {
    val index = findIndexById(id)
    if (index == -1) {
      false
    } else {
      customerInfo.remove(index)
      true
    }
  }

  // 根据编号查找客户在ListBuffer中的索引，如果未找到则返回-1
  def findIndexById(id: Int): Int = {
    var index = -1

    // 使用breakable来控制循环，直到找到匹配的客户或者遍历完整个ListBuffer
    breakable {
      for (i <- 0 until customerInfo.length) {
        if (customerInfo(i).id == id) {
          index = i
          break()
        }
      }
    }
    index
  }

  // 更新指定编号的客户信息
  def updateCustomerInfo(): Unit = {
    println("修改客户操作：")
    println("请选择待修改客户编号(-1退出)：")
    val id = StdIn.readInt()
    if (id == -1) {
      println("退出修改操作")
      return
    }
    val index = findIndexById(id)
    if (index == -1) {
      println("请输入正确的客户id！")
      return
    } else {
      println("请依次输入新的用户信息：")
      println("姓名(" + customerInfo(index).name + "):")
      customerInfo(index).name = StdIn.readLine()

      println("年龄(" + customerInfo(index).age + "):")
      customerInfo(index).age = StdIn.readShort()

      println("性别(" + customerInfo(index).gender + "):")
      customerInfo(index).gender = StdIn.readChar()

      println("电话(" + customerInfo(index).phone + "):")
      customerInfo(index).phone = StdIn.readLine()

      println("邮箱(" + customerInfo(index).email + "):")
      customerInfo(index).email = StdIn.readLine()
      println("修改用户信息完成！")
      return
    }
  }
}