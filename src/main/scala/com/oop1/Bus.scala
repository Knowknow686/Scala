package com.oop1

// 定义一个继承自 MotoVehicle 的 Bus 类
class Bus extends MotoVehicle {
  // 定义一个表示座位数量的变量 seatCount，初始值为 0
  var seatCount: Int = 0 //

  // 定义一个构造函数，用于初始化 Bus 对象的 no, brand 和 seatCount 属性
  def this(no: String, brand: String, seatCount: Int) {
    // 调用无参构造函数来初始化 Bus 类的其他属性（假设 MotoVehicle 有一个无参构造函数）
    this()
    // 设置 Bus 对象的 no 属性
    this.no = no
    // 设置 Bus 对象的 brand 属性
    this.brand = brand
    // 设置 Bus 对象的 seatCount 属性
    this.seatCount = seatCount
  }

  // 定义一个计算租金的方法 calRent，根据座位数量和租赁天数计算租金
  def calRent(days: Int): Int = {
    // 如果座位数量小于等于 16，每天租金为 800 元；否则，每天租金为 1500 元
    if (seatCount <= 16) days * 800 else days * 1500
  }
}
