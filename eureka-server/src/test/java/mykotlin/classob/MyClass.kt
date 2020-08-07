package mykotlin.classob

import com.alibaba.fastjson.JSONObject
import kotlin.test.Test

typealias MyClassList = List<MyClass>


class MyClass : MyInterface{
    override fun doit() {
        println("doit")
        println(foo1().x)
//        println(publicFoo().x) 错误，非私有方法返回的匿名对象其属性是不能访问的（在任何地方）
    }

    override val prop: Int
        get() = this.hashCode()

    private fun foo1() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {
        val x: String = "x"
    }

    /**
     * 匿名内部对象
     */
    object Site {
        var url:String = ""
        val name: String = "菜鸟教程"
        override fun toString(): String {
            return JSONObject.toJSONString(this)
        }
    }

    @Test fun TESTX(){
        val c:MyInterface = MyClass()
        c.doit();

//        val clist:MyClassList = listOf(c)

        //匿名对象的初始化方法，这是单例模式
        val site = Site
        println(site)


    }
}