package com.funtion

object Lamddemo {
  def main(args: Array[String]): Unit = {
    var inc = (x: Int) => x + 2
    var result = inc(8)
    println(result)

    var mul = (x: Int, y: Int) => x * y
    var resultmul = mul(2, 3)
    println(resultmul)
  }
}