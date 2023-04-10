

fun main (){

    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    val ambilData = capital.getValue("Jakarta")
    val mapsKey = capital.keys
    val mapsvalue = capital.values

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Jombang", "Jawa Timur")
    mutableCapital.put("Berlin", "Germany")

    println(capital)
    println(mutableCapital)

}