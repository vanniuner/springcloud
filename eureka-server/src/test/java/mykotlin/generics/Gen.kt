package mykotlin.generics

/**
 * 泛型： Generics
 * 让一个类型能被广泛使用，即通用化称之为泛型
 * 一般用于函数的参数定义，让函数更通用
 */
fun main(){
    val list = arrayOf("A","B",1)
    println(list.size)

    show(2)
    show("xx")
}

/**
 * 自定义一个泛型函数
 * 一般用T表示type，但实际上可以用任何字符来表达
 */
fun <T> show(para:T){
    println(para)
}