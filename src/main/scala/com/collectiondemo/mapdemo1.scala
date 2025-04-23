object Main {
  def main(args: Array[String]): Unit = {
    // 定义一个数组，包含名字
    val arr = Array("Tom", "Jerry", "Mike", "John")
    // 定义一个映射，名字到年龄的映射
    val map = Map("Tom" -> 25, "Jerry" -> 30, "Mike" -> 35, "John" -> 40)
    // 调用 getScores 方法，传入数组和映射，获取对应的年龄数组
    val scores = getScores(arr, map)
    // 打印年龄数组，用逗号分隔
    println(scores.mkString(", "))
  }
  
  // 定义 getScores 方法，接收一个字符串数组和一个字符串到整数的映射
  def getScores(arr: Array[String], map: Map[String, Int]): Array[Int] = {
    // 使用 flatMap 方法，尝试从映射中获取数组中每个名字对应的值
    // 如果名字在映射中存在，则返回对应的年龄；如果不存在，则返回 None
    // flatMap 会自动过滤掉 None 的值，只保留 Some 中的值
    val scores = arr.flatMap(map.get(_))
    // 返回过滤后的年龄数组
    return scores
  }
}
