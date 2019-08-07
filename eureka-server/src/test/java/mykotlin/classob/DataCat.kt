package mykotlin.classob

import com.alibaba.fastjson.JSONObject

data class DataCat(val name:String){
    var city:String = "cikago"

    override fun toString(): String {
        return JSONObject.toJSONString(this)
    }
}

fun main(){
    val d = DataCat("name")
    println(d.name)
}