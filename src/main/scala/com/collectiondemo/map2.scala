package com.collectiondemo

// 定义一个名为 map5 的对象
object map2 {
  // 主函数，程序的入口点
  def main(args: Array[String]): Unit = {
    // 定义一个字符串 str
    var str = "wubangxin helloworld i love you"
    // 调用 getStringCount 函数，传入 str 字符串，并将返回的字符计数字典赋值给 mapstr
    var mapstr = getStringCount(str)
    // 遍历 mapstr 字典，打印每个字符及其出现的次数
    for((k, v) <- mapstr) {
      println("字符" + k + "出现次数：" + v)
    }
  }

  // 定义一个函数 getStringCount，接收一个字符串 s，返回一个字符到整数的映射，表示每个字符出现的次数
  def getStringCount(s: String): Map[Char, Int] = {
    // 初始化一个空的字符计数字典 mapcount
    var mapcount = Map[Char, Int]()
    // 遍历字符串 s 中的每一个字符
    for(scahr <- s) {
      // 获取当前字符在 mapcount 中的计数，如果不存在则默认为 0，然后加 1
      var count = mapcount.getOrElse(scahr, 0) + 1
      // 将当前字符及其计数更新到 mapcount 字典中
      mapcount += (scahr -> count)
    }
    // 返回字符计数字典 mapcount
    return mapcount
  }
}
