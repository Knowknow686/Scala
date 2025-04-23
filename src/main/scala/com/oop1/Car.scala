package com.oop1

// 定义一个名为Car的类，该类继承自MotoVehicle类
class Car extends MotoVehicle {
  // 定义一个变量cartype，用于存储汽车的类型，默认值为空字符串
  var cartype = ""

  // 定义一个构造函数，用于初始化Car类的实例
  def this(no: String, brand: String, cartype: String) {
    // 调用默认构造函数
    this()
    // 初始化继承自MotoVehicle的no字段
    this.no = no
    // 初始化继承自MotoVehicle的brand字段
    this.brand = brand
    // 初始化cartype字段
    this.cartype = cartype
  }

  // 定义一个方法calRent，用于计算汽车的租金
  def calRent(days: Int): Int =
    // 根据cartype的值计算租金，如果cartype为"1"，则每天租金为600元
    if ("1".equals(cartype)) {
      days * 600
    }
    // 如果cartype为"2"，则每天租金为500元
    else if ("2".equals(cartype)) {
      500 * days
    }
    // 如果cartype既不是"1"也不是"2"，则每天租金为300元
    else 300 * days
}
