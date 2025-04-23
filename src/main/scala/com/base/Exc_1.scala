package com.base

object Exc_1 {
  def main(args: Array[String]): Unit = {
    var year = 2025
    var month = 3//根据当天日期进行更改，月
    var date = 13//根据当天日期进行更改，日

    if (month < 1 || month > 12) {
      println("错误：月份必须在1到12之间。")
      return
    }

    if (date < 1 || date > getDaysInMonth(year, month)) {
      println("错误：日期超出该月份的最大天数。")
      return
    }

    var sum = 0
    for (i <- 1 to month - 1) {
      sum += getDaysInMonth(year, i)
    }
    sum += date

    println("sum=" + sum)
  }

  //调用该方法获取指定年月的天数
  def getDaysInMonth(year: Int, month: Int): Int = {
    month match {
      case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
      case 4 | 6 | 9 | 11 => 30
      case 2 =>
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 29 else 28
      case _ => 0 // 这个case理论上不会被执行，因为我们已经在main里进行了月份验证
    }
  }
}