package com.funtion

object test10 {
  // 主函数入口
  def main(args: Array[String]): Unit = {
    // 初始化一个包含用户信息的数组，每个元素代表一个用户的姓名、年龄和工资
    val datas = Array("张三 20 2500", "李四 30 5000", "赵五 25 3500")
    // 调用getSalary函数，传入用户信息数组和一个匿名函数，该函数用于从字符串中提取工资信息
    var result = getSalary(datas, x => x.split(" ")(2).toInt)
    // 输出最高工资用户的信息
    println("最高工资用户信息:" + result)
  }

  // 定义一个函数getSalary，用于在给定的用户信息数组中找到工资最高的用户信息
  // 参数datas是一个包含用户信息的字符串数组
  // 参数func是一个函数，用于从字符串中提取需要比较的整数值（在这个例子中是工资）
  def getSalary(datas: Array[String], func: String => Int) = {
    // 初始化tmp变量，用于存储目前找到的工资最高的用户信息，初始值为数组的第一个元素
    var tmp = datas(0)
    // 遍历datas数组中的每个元素
    for (element <- datas) {
      // 使用func函数提取当前元素和tmp中的工资信息，并比较
      // 如果当前元素的工资高于tmp中的工资，则更新tmp为当前元素
      if (func(tmp) < func(element)) {
        tmp = element
      }
    }
    // 返回工资最高的用户信息
    tmp
  }
}
