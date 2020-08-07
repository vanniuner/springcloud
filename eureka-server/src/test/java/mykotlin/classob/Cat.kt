package mykotlin.classob

import com.alibaba.fastjson.JSONObject

class Cat(val country: String) {

    init {
        println("init class cat with $country")
    }
    var name : String? = "xx"
    var age:Int? = 2
    var gender:String = "男"
    var father: String = "none"
    val intter:Int = 1

    constructor(name: String, age: Int,father:String = "null") : this("") {
        this.age = age
        this.name = name
        this.father = father
    }

    override fun toString(): String {
        return JSONObject.toJSONString(this)
    }

}

fun main(){
    val c:Cat = Cat("name",2,"father")
    println(c)

    val face:MyInterface = MyClass()
    println(face.doit())
    println(face.prop)

    fun Int.wto(name:String):String{
        return this.toString() + name
    }

    val i:Int = 5
    println(i.wto("go"))

    val c1:Cat = Cat("xx")
    println(c1.country)
}