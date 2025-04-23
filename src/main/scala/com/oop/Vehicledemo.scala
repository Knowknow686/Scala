package com.oop

// 定义一个名为Vehicle的抽象类，通常作为父类使用。
abstract class Vehicle {
  // 声明一个名为checkType的抽象方法，该方法返回一个字符串。
  def checkType(): String
}

// 定义一个名为Car1的类，继承自Vehicle抽象类。
class Car1 extends Vehicle {
  // 重写继承自Vehicle的checkType方法，返回字符串"i am a car "。
  override def checkType(): String = {"i am a car "}
}

// 定义一个名为Bysical的类，继承自Vehicle抽象类。
// 注意：这里的类名可能是拼写错误，应该是"Bicycle"。
class Bysical extends Vehicle {
  // 实现继承自Vehicle的checkType方法，返回字符串"i am a bike"。
  override def checkType(): String = {"i am a bike"}
}

// 定义一个名为Vehichedemo的单例对象，包含程序的入口点。
// 注意：这里的对象名可能是拼写错误，应该是"VehicleDemo"。
object Vehichedemo {
  def main(args: Array[String]): Unit = {
    // 创建Car1类的一个实例，并将其赋值给变量v1。
    var v1 = new Car1
    // 调用v1的checkType方法，并打印其返回的字符串。
    println(v1.checkType())
    // 创建Bysical类的一个实例，并将其赋值给变量v2。
    var v2 = new Bysical
    // 调用v2的checkType方法，并打印其返回的字符串。
    println(v2.checkType())
  }
}