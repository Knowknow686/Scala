// 定义包名为 com.funtion
package com.funtion

// 定义一个名为 test4 的对象，其中包含一个测试方法和主方法
object test4 {
  // 定义一个名为 test 的方法，接收一个函数 fun 作为参数，该函数接受一个 Int 类型的参数并返回一个 Int 类型的值
  // 同时接收两个 Int 类型的参数 low 和 high，表示一个范围
  // 该方法返回一个包含 (x, fun(x)) 的元组的序列，其中 x 从 low 到 high（包括 low 和 high）
  def test(fun :(Int) => Int, low: Int, high: Int) = (low to high).map(x => (x, fun(x)))

  // 定义程序入口点 main 方法，接收一个字符串数组 args 作为参数
  def main(args: Array[String]): Unit = {
    // 调用 test 方法，传入一个匿名函数 x => x*x，以及参数 5 和 5
    // 该匿名函数的作用是计算传入整数的平方
    // 由于 low 和 high 都是 5，因此 test 方法只会计算 5 的平方一次
    val x = test(x => x * x, 5, 5)

    // 打印结果 x，输出为 Vector((5,25))
    println(x)
  }
}