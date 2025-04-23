package com.oop

// 定义一个名为person的类，包含两个变量：name和age
class person(var name: String, var age: Int) {
  // 定义一个sayHello方法，返回一个包含name和age信息的字符串
  def sayHello(): String = "hello: " + name + " the age is: " + age
}

// 定义一个名为Employee的类，继承自person类，并增加一个变量salary
class Employee(name: String, age: Int, var salary: Double) extends person(name, age) {
  // 重写sayHello方法，除了调用父类的sayHello方法外，还添加了salary信息
  override def sayHello(): String = super.sayHello() + ", salary is: " + salary
}

// 定义一个名为testpersonextends的对象，包含一个main方法，作为程序的入口点
object testpersonextends {
  def main(args: Array[String]): Unit = {
    // 创建一个person类的实例p1，并设置name为"John"，age为25
    var p1 = new person("John", 25)
    // 调用p1的sayHello方法，并打印返回的字符串
    println(p1.sayHello())
    // 创建一个Employee类的实例p2，并设置name为"Jane"，age为30，salary为50000
    var p2 = new Employee("Jane", 30, 50000)
    // 调用p2的sayHello方法，并打印返回的字符串
    println(p2.sayHello())
  }
}