package com.oop

// 定义一个抽象类Animal，包含抽象方法walk和具体方法breath
abstract class Animal {
  // 抽象方法walk，参数为speed，表示行走的速度
  def walk(speed: Int)

  // 具体方法breath，实现动物呼吸的功能
  def breath(): Unit = {
    println("animal breaths")
  }
}

// 定义一个trait Flyable，包含具体方法hasFeather和抽象方法fly
trait Flyable {
  // 具体方法hasFeather，返回true，表示该特质的实现者有羽毛
  def hasFeather = true

  // 抽象方法fly，表示飞行的功能
  def fly
}

// 定义一个trait Swimable，包含抽象方法swim
trait Swimable {
  // 抽象方法swim，表示游泳的功能
  def swim
}

// 定义一个类FishEagle，继承自Animal，并混入Flyable和Swimable特质
class FishEagle extends Animal with Flyable with Swimable {
  // 重写Animal类中的walk方法，实现鱼鹰行走的功能
  def walk(speed: Int): Unit = println("fish eagle walk with speed " + speed)

  // 实现Swimable特质中的swim方法，实现鱼鹰游泳的功能
  def swim(): Unit = println("fish eagle swim fast")

  // 实现Flyable特质中的fly方法，实现鱼鹰飞行的功能
  def fly(): Unit = println("fish eagle fly fast")
}

// 定义一个object test，包含main方法，作为程序的入口
object test {
  // 主方法，程序从这里开始执行
  def main(args: Array[String]): Unit = {
    // 创建FishEagle类的实例
    val fishEagle = new FishEagle

    // 调用fishEagle实例的fly方法，输出鱼鹰飞行的信息
    fishEagle.fly()

    // 调用fishEagle实例的swim方法，输出鱼鹰游泳的信息
    fishEagle.swim()

    // 调用fishEagle实例的hasFeather方法，输出鱼鹰是否有羽毛的信息
    println(fishEagle.hasFeather)
  }
}
