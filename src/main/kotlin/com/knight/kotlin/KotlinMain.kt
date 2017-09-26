package com.knight.kotlin

/**
 * Created by knightoneadmin on 2017/9/26.
 */

val FINAL_HELLO_WORLD: String = "hello world"//  val 修饰的 变量是不可变的  相当于  Java 的 final

var value: String = "knight"     // var 修饰的变量是可变的

fun main(args: Array<String>) {

////  FINAL_HELLO_WORLD="welcome"  // FINAL_HELLO_WORLD  因为是val修饰的，所以重新赋值是不可以的
//    value = "name"   //var  可以重新赋值
//
//    val MY_NAME = "my name is knight"  // 这里可以省轿略  ：String   Kotlin 会自动识别是 String 类型
//    val MY_NAME_AGE = 24
//    println(FINAL_HELLO_WORLD)
//    println(value)
//    println("我的名字 =$MY_NAME,我的年龄 =$MY_NAME_AGE")
    checkAgrs(args)
    val args0 = args[0].toInt()
    val args1 = args[1].toInt()
    println("$args0+$args1 = ${sum(args[0].toInt(), args[1].toInt())}")
    println("$args0+$args1 = ${sum2(args[0].toInt(), args[1].toInt())}")

}

fun checkAgrs(args: Array<String>) {
    if (args.size != 2) {
        printlnUser()
        System.exit(0)
    }
}

fun printlnUser() {
    println("您要输入两个数整数， 例如： 1，4")
}


//如果定义函数 fun-->>  function
fun sum(agrs1: Int, agrs2: Int): Int {
    return agrs1 + agrs2
}

//fun 的第二种定义 如果是一个简单的 返回值 函数， 可以 直接  =
fun sum2(agrs1: Int, agrs2: Int) = agrs1 + agrs2