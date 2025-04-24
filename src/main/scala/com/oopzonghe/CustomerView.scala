package com.oopzonghe

import scala.io.StdIn

class CustomerView {
  var flag = true
  private val customerService = new CustomerService()

  def mainMenu(): Unit = {
    do {
      println("****************************")
      println("*     客户信息管理系统\t\t   *")
      println("*        1.添加客户         *")
      println("*        2.修改客户         *")
      println("*        3.删除客户         *")
      println("*        4.查询客户         *")
      println("*        5.退出系统         *")
      println("****************************")
      print("请输入您的选择：")

      val operNum = StdIn.readInt()
      operNum match {
        case 1 => customerService.addCustomerInfo()
        case 2 => customerService.updateCustomerInfo()
        case 3 => customerService.delCustomerInfo()
        case 4 => customerService.getCustomerInfo()
        case 5 => flag = false
      }
    } while (flag)
    println("已经退出系统！")
  }
}