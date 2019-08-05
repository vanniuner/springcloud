package mykotlin.highlevelfun

data class Country(val name:String,val contry:String,val popul:Int)

class CountryApp{
    fun filterCountries(contries:List<Country>,test:(Country) -> Boolean):List<Country>{
        val res = mutableListOf<Country>()
        for(c in contries){
            if(test(c)){
                res.add(c)
            }
        }
        return res
    }
}

class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.contry == "EU" && country.popul > 10000
    }
}

fun main(){
    val countryApp = CountryApp()
    val list:List<Country> = listOf<Country>(Country("EUR","EU",20000),
            Country("EUR2","EU2",20000))
    val listr:List<Country> = countryApp.filterCountries(list,{c->c.contry == "EU" && c.popul > 10000})
    println(listr)

    listOf(1, 2, 3).forEach { item -> println(item) }

}
