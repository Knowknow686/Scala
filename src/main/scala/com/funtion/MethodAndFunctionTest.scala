package com.funtion

object MethodAndFunctionTest {
  // 定义一个方法
  // 方法m1参数要求是一个函数，该函数的参数必须是两个Int类型
  // 返回值类型也是Int类型
  def m1(f: (Int, Int) => Int): Int = {
    // 调用传入的函数f，并传入参数2和6，返回其结果
    return f(2, 6)
  }

  // 定义另一个方法
  // 方法m2参数要求是一个函数，该函数的参数必须是两个Int类型
  // 以及两个Int类型的额外参数x和y
  // 返回值类型也是Int类型
  def m2(f: (Int, Int) => Int, x: Int, y: Int): Int = {
    // 调用传入的函数f，并传入参数x和y，然后将结果与x和y相加
    f(x, y) + x + y
  }

  def main(args: Array[String]): Unit = {
    // 定义一个函数f1，该函数接受两个Int类型的参数，并返回它们的和
    val f1 = (x: Int, y: Int) => x + y
    // 定义另一个函数f2，该函数接受两个Int类型的参数，并返回它们的乘积
    val f2 = (m: Int, n: Int) => m * n

    // 调用m1方法，传入f1函数，m1方法将返回f1(2, 6)的结果，即8
    val r1 = m1(f1)
    println(r1)

    // 调用m1方法，传入f2函数，m1方法将返回f2(2, 6)的结果，即12
    val r2 = m1(f2)
    println(r2)

    // 调用m2方法，传入f2函数以及参数2和5
    // m2方法将返回f2(2, 5) + 2 + 5的结果，即10 + 2 + 5 = 17
    val r3 = m2(f2, 2, 5)
    println("r3=" + r3)
  }
}
