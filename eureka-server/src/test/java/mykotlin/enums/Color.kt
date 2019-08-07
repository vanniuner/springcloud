package mykotlin.enums

enum class Color(val rgb: Int, val clName : String) {
        RED(0xFF0000,"RED"),
        GREEN(0x00FF00,"GREEN"),
        BLUE(0x0000FF,"BLUE")
}

fun main(){
        val c = Color.BLUE
        println("${c.rgb}---${c.clName}")
}