package mykotlin.classob

interface MyInterface {
    val prop: Int // 抽象的

    fun doit()

    fun foo() {
        print(prop)
    }
}