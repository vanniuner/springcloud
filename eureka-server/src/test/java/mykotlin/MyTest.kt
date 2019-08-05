package mykotlin

import kotlin.test.Test

class MyTest {

    @Test fun doit(){
        val x = intArrayOf(1,12,3,4)
        x[2]=7
        println(x[2])
    }

    @Test fun add(){
        var a = 1
        a += 1
        println(a)
    }
}