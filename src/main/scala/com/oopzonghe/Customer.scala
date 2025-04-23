package com.oopzonghe

// 定义一个名为Customer的类，用于存储客户信息
class Customer {
  // 定义客户ID，类型为Int，初始值为默认的占位符_
  var id: Int = _
  // 定义客户年龄，类型为Int，初始值为默认的占位符_
  var age: Int = _
  // 定义客户姓名，类型为String，初始值为默认的占位符_
  var name: String = _
  // 定义客户性别，类型为Char，初始值为默认的占位符_
  var gender: Char = _
  // 定义客户电话，类型为String，初始值为默认的占位符_
  var phone: String = _
  // 定义客户邮箱，类型为String，初始值为默认的占位符_
  var email: String = _

  // 构造函数，用于初始化所有字段
  def this(id: Int, age: Int, name: String, gender: Char, phone: String, email: String) {
    // 调用默认构造函数
    this()
    // 设置客户ID
    this.id = id
    // 设置客户年龄
    this.age = age
    // 设置客户姓名
    this.name = name
    // 设置客户性别
    this.gender = gender
    // 设置客户电话
    this.phone = phone
    // 设置客户邮箱
    this.email = email
  }

  // 重载的构造函数，用于初始化除ID以外的所有字段
  def this(age: Int, name: String, gender: Char, phone: String, email: String) {
    // 调用默认构造函数
    this()
    // 设置客户年龄
    this.age = age
    // 设置客户姓名
    this.name = name
    // 设置客户性别
    this.gender = gender
    // 设置客户电话
    this.phone = phone
    // 设置客户邮箱
    this.email = email
  }

  // 重写toString方法，用于返回客户信息的字符串表示
  override def toString: String = {
    // 按格式化字符串返回客户信息
    this.id + "\t\t" + this.age + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.phone + "\t\t" + this.email
  }
}