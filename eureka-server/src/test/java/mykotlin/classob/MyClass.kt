package mykotlin.classob

import kotlin.test.Test

class MyClass : MyInterface{
    override fun doit() {
        println("doit")
    }

    override val prop: Int
        get() = this.hashCode()

    @Test fun TESTX(){
        val c:MyInterface = MyClass()
        c.doit();
    }
}