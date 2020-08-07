package mykotlin.highlevelfun

data class Country(val name:String,val country:String,val population:Int)

class CountryApp{
    fun filterCountries(countryList:List<Country>,test:(Country) -> Boolean):List<Country>{
        val res = mutableListOf<Country>()
        for(c in countryList){
            if(test(c)){
                res.add(c)
            }
        }
        return res
    }
}

class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.country == "EU" && country.population > 10000
    }
}

fun main(){
    val countryApp = CountryApp()
    val countryTest:CountryTest = CountryTest()
    val list:List<Country> = listOf<Country>(Country("EUR","EU",20000),
            Country("EUR2","EU2",20000))
    val listResult:List<Country> = countryApp.filterCountries(list,countryTest::isBigEuropeanCountry)
    println(listResult)

    listOf(1, 2, 3).forEach { item -> println(item) }

}
