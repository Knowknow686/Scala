package com.funtion

// 定义一个表示学生成绩的案例类，包含学生姓名和成绩
case class StudentScore(name: String, score: Int)

object ScoreAnalysis {
  def main(args: Array[String]): Unit = {
    // 创建一个包含学生成绩的列表
    val scores = List(
      StudentScore("Alice", 85),
      StudentScore("Bob", 90),
      StudentScore("Charlie", 75),
      StudentScore("David", 80),
      StudentScore("Emily", 95)
    )

    // 定义一个函数用于筛选及格学生（成绩大于等于80）
    def filterPassStudents(scores: List[StudentScore]): List[StudentScore] = {
      scores.filter(_.score >= 80) // 使用filter方法筛选出成绩大于等于80的学生
    }

    // 定义一个函数用于计算学生成绩的平均值
    def calculateAverageScore(students: List[StudentScore]): Double = {
      if (students.isEmpty) // 检查学生列表是否为空
        0.0 // 如果为空，返回平均成绩为0.0
      else
        students.map(_.score).sum.toDouble / students.length // 计算平均成绩：先将学生成绩映射为一个整数列表，然后求和并转换为Double类型，最后除以学生数量
    }

    // 筛选及格学生
    val passStudents = filterPassStudents(scores)
    println("及格学生：" + passStudents.map(_.name).mkString(", ")) // 输出及格学生的姓名，使用mkString方法将姓名列表转换为字符串

    // 计算平均成绩
    val averageScore = calculateAverageScore(scores)
    println("平均成绩：" + averageScore) // 输出平均成绩
  }
}
