// 定义包名
package com.funtion

// 定义一个名为test5的对象
object test5 {
  // 定义主函数，程序的入口点
  def main(args: Array[String]): Unit = {

    // 定义一个整数数组a，包含元素5, 6, 9, 4
    val a = Array[Int](5, 6, 9, 4)

    // 使用reduceLeft方法找到数组a中的最大值，并将其赋值给变量max
    // math.max(_,_): 这是一个匿名函数，用于比较两个整数并返回较大的那个
    val max = a.reduceLeft(math.max(_, _))
    // 打印出数组a中的最大值
    println(max)

    // 打印出数字5的阶乘
    // 调用fac函数计算5的阶乘，并将结果与字符串拼接后打印
    print("5的阶乘: " + fac(5))
  }

  // 定义一个函数fac，用于计算给定整数n的阶乘
  // 参数n是一个整数
  def fac(n: Int): Int = {
    // 使用reduceLeft方法计算从1到n的所有整数的乘积
    // (_*_)：这是一个匿名函数，用于将两个整数相乘
    (1 to n).reduceLeft(_ * _)
  }
}
