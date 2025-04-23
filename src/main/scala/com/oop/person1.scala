package com.oop

// 定义一个名为 person1 的类
class person1 {
  // 定义一个名为 value 的变量，初始值为 1000
  var value = 1000
  // 定义一个名为 age 的变量，初始值为 0
  var age = 0
  // 定义一个名为 increate 的方法，该方法每次调用时将 value 增加 100
  def increate(): Unit = {
    value += 100
  }
  // 定义一个名为 current 的方法，该方法返回 value 的当前值
  def current: Int = {
    value
  }
}

// 定义一个名为 person1 的对象，该对象包含一个 main 方法作为程序入口
object person1 {
  // 定义 main 方法，接收一个字符串数组作为参数
  def main(args: Array[String]): Unit = {
    // 创建一个 person1 类的实例对象 p
    val p = new person1
    // 调用 p 对象的 increate 方法，将 p 的 value 增加 100
    p.increate()
    // 设置 p 对象的 age 属性为 20
    p.age = 20
    // 打印 p 对象的 age 属性值
    println(p.age)
    // 打印 p 对象的 current 方法返回的 value 值
    println(p.current)
  }
}