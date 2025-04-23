package com.oop1

object TestRent {
  def main(args: Array[String]): Unit = {
    var days = 5
    //租赁天数
    var totalRent = 0
    //总租赁费用
    //1、客户租赁的多辆汽车信息及租赁天数
    val motos = new Array[MotoVehicle](4)
    motos(0) = new Car("京NY28588","宝马","1")
    motos(1) = new Car("京NNN3284","宝马","1")
    motos(2) = new Car("京NT43765","别克","2")
    motos(3) = new Bus("京5643765","金龙",34)

    //2、计算总租赁费用
    val customer = new Customer("新宇")
    //计算总价
    totalRent = customer.calcTotalRent(motos,days)
    //输出客户姓名和总租赁费用
    println("\n客户名: "+ customer.name + "，租赁天数:" + days + "，租赁总费用:" + totalRent + "。")
  }
}