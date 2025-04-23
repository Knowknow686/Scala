package com.collectiondemo

// 导入scala.collection.mutable包，以便使用可变的Map
import scala.collection.mutable

object map1 {
  // 创建一个不可变的Map，包含三个键值对："Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京"
  val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
  // 打印不可变Map map1
  println(map1)

  // 创建一个可变的Map，包含三个键值对："Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京"
  val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
  // 打印可变Map map2
  println(map2)

  // 创建一个空的可变Map，键类型为String，值类型为Int
  val map3 = mutable.Map[String, Int]()
  // 向map3中添加一个键值对："a" -> 1
  map3 += ("a" -> 1)
  // 打印map3
  println("map3=" + map3)

  // 从map2中获取键为"Alice"的值
  val value1 = map2("Alice")
  // 打印获取到的值
  println(value1)

  // 检查map2中是否包含键"Alice"
  if (map2.contains("Alice")) {
    // 如果键存在，打印键和对应的值
    println("key存在,值=" + map2("Alice"))
  } else {
    // 如果键不存在，打印key不存在的消息
    println("key不存在:)")
  }

  // 使用getOrElse方法获取键为"Alice"的值，如果不存在则返回"默认的值"
  println(map2.getOrElse("Alice", "默认的值"))

  // 创建一个可变的Map，键值对类型为 (String, Any)，包含三个键值对："A" -> 1, "B" -> "北京", "C" -> 3
  val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
  // 修改键为"A"的值为20
  map5("A") = 20
  // 向map5中添加键值对："E" -> 20
  map5("E") = 20
  // 向map5中添加键值对："D" -> 4
  map5 += ("D" -> 4)
  // 再次修改键为"B"的值为5
  map5 += ("B" -> 5)
  // 打印修改后的map5
  println("map5=" + map5)

  // 向map5中再次添加键值对："E" -> 6, "F" -> 7 （注意："E"的值会被覆盖）
  map5 += ("E" -> 6, "F" -> 7)
  // 创建一个新的map6，它包含map5的所有键值对以及额外的键值对："g" -> 9, "z" -> 8
  // 注意：这里使用的是"+"，它不会修改map5，而是创建一个新的Map
  val map6 = map5 + ("g" -> 9, "z" -> 8)
  // 打印map6
  println(map6)

  // 从map5中移除键为"A", "B", "AAA"的键值对
  // 注意："AAA"键不存在，也不会报错
  map5 -= ("A", "B", "AAA")
  // 打印移除键值对后的map5
  println("map5=" + map5)

  // 创建一个新的可变Map map7，包含三个键值对："A" -> 1, "B" -> "北京", "C" -> 3
  val map7 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
  println("---------(k,v) <- map7---------")
  // 使用for循环遍历map7，打印每个键和对应的值
  for ((k, v) <- map7) println(k + "is mapped to " + v)

  println("-------v <- map7-------")
  // 这个for循环的写法有些不正确，通常应该是 (k, v) <- map7，这里直接使用v会打印出Map的Entry
  // 但是为了保持原样，这里按照原样添加注释
  // 打印每个键值对（Entry），以及每个键值对的键和值
  for (v <- map7) println(v + "key=" + v._1 + "val=" + v._2)

  println("------v <- map7.keys--------")
  // 使用for循环遍历map7的键集，打印每个键及其对应的值
  for (k <- map7.keys) println("key:" + k + "value:" + map7(k))

  println("------v <- map7.values------")
  // 使用for循环遍历map7的值集，打印每个值
  for (v <- map7.values) println(v)
}
