package com.oop

// 定义一个名为 person2 的类
class person2 {
  // 私有变量 name，初始值为 "----"
  private var name = "----"
  // 私有变量 age，初始值为 0
  private var age = 0

  // 辅助构造函数，接受一个 String 类型的参数 name
  def this(name: String) {
    // 调用主构造函数
    this()
    // 设置 name 的值
    this.name = name
  }

  // 辅助构造函数，接受一个 String 类型的参数 name 和一个 Int 类型的参数 age
  def this(name: String, age: Int) {
    // 调用上一个辅助构造函数
    this(name)
    // 设置 age 的值
    this.age = age
  }
}

// 定义一个名为 person2 的对象，包含 main 方法
object person2 {
  // 定义 main 方法，作为程序入口
  def main(args: Array[String]): Unit = {
    // 创建一个 person2 类的对象 p1，使用默认构造函数
    val p1 = new person2
    // 打印 p1 的 name 值，由于是私有变量，这里会编译错误
    println(p1.name)
    // 创建一个 person2 类的对象 p2，使用接受一个 String 参数的构造函数
    val p2 = new person2("John")
    // 打印 p2 的 name 值
    println(p2.name)
    // 创建一个 person2 类的对象 p3，使用接受一个 String 和一个 Int 参数的构造函数
    val p3 = new person2("Jane", 25)
    // 打印 p3 的 name 值
    println(p3.name)
    // 打印 p3 的 age 值
    println(p3.age)
  }
}