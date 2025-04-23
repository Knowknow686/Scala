package com.oop1

// 定义一个名为Customer的类
class Customer {
  // 定义一个可变的String类型的变量name，用于存储客户姓名
  var name: String = "" // 客户姓名

  // 辅助构造器，接受一个String类型的参数name，并调用主构造器初始化后设置name属性
  def this(name: String) {
    // 调用主构造器
    this()
    // 设置name属性
    this.name = name
  }

  /**
   * 计算多辆摩托车总租赁价格
   *
   * @param motos 包含MotoVehicle对象的数组
   * @param days  租赁天数
   * @return 多辆摩托车的总租赁价格
   */
  def calcTotalRent(motos: Array[MotoVehicle], days: Int): Int = {
    // 初始化总租赁价格为0
    var sum = 0
    // 初始化索引变量i为0
    var i = 0
    // 遍历motos数组中的每一个MotoVehicle对象
    for (i <- 0 to motos.length - 1) {
      // 调用每个MotoVehicle对象的calRent方法计算租赁价格，并将结果累加到sum中
      sum += motos(i).calRent(days)
    }
    // 返回总租赁价格
    sum
  }
}
