package mykotlin

import kotlin.test.Test

class MyTest {

    @Test fun doit(){
        val x = intArrayOf(1,12,3,4)
        x[2]=7
        val l = 1L + 3
        println(1f in 1.1..4.4)
    }

    @Test fun add(){
        var a = 1
        a += 1
        println(a)
    }

    @Test fun array(){
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { println( it ) }

        val asc6 = Array(6) { i -> i.toString() }
        asc6.forEach { println( it ) }

        val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
        println(text)
        val i = "内蒙古"
        println("i = $i,${i.length}") // 输出“i = 10”
        println("i = ${"$"}") // 输出“i = 10”
    }
}