package com.funtion

// 定义一个对象 ArrayStr
object ArrayStr {
  // 定义一个方法 stringArr，用于将整数数组转换为字符串格式
  def stringArr(arr: Array[Int]): String = {
    // 定义一个字符串对象 s，初始内容为空
    var s = ""
    // 首先将字符串 s 拼接一个“[”，表示数组的开始
    s += "["
    // 使用 for 循环遍历数组 arr 中的每一个元素
    for (x <- 0 to (arr.length - 1)) {
      // 将当前数组元素 arr(x) 转换为字符串并拼接到 s 中
      s += arr(x)
      // 检查当前元素是否是数组的最后一个元素
      if (x == arr.length - 1) {
        // 如果是最后一个元素，则在 s 末尾拼接“]”，表示数组的结束
        s += "]"
      } else {
        // 如果不是最后一个元素，则在 s 末尾拼接一个“,”，作为分隔符
        s += ","
      }
    }
    // 返回最终拼接好的字符串 s
    return s
  }

  // 定义程序入口点 main 方法
  def main(args: Array[String]): Unit = {
    // 创建一个整数数组 arr，包含元素 1, 2, 3, 4, 5
    var arr = Array(1, 2, 3, 4, 5)
    // 调用 stringArr 方法，将 arr 转换为字符串格式，并将结果存储在 result 变量中
    var result = stringArr(arr)
    // 输出最终的字符串结果
    println("最终的字符串是：" + result)
  }
}

