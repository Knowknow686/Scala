package com.oop1

// 机动车类，抽象类
abstract class MotoVehicle {
  // 定义机动车的编号
  var no = ""
  // 定义机动车的品牌
  var brand = ""

  // 辅助构造器，用于初始化编号和品牌
  def this(no: String, brand: String) {
    this() // 调用主构造器
    this.no = no
    this.brand = brand
  }

  // 抽象方法，计算租赁佣金，根据租赁天数计算佣金
  def calRent(days: Int): Int
}