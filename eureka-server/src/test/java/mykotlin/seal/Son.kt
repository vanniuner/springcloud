package mykotlin.seal

/**
 * 印章子类
 * 表示该类只能为 指定类型的子类
 *
 * 子类类型有限
 * 更在意类型，类型可扩展方法和属性
 */
sealed class Son {
    fun hello(){
        println("hello")
    }

    class Son1:Son()
    class Son2:Son()
}

fun main(){
    val son1:Son = Son.Son1()
    son1.hello()

    val son2:Son = Son.Son2()
    son2.hello()

    val list = listOf<Son>(son1,son2)
    for ( x in list){
        x.hello()
    }
}