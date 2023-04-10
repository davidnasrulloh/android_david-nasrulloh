class User(val name:String, val age:Int)

data class DataUser(val name:String, val age:Int)

data class DataPerkenalan(val name:String, val asal:String){
    fun intro(){
        println("Nama saya adalah $name asal dari $asal")
    }
}

fun main (){

    val user = User("David", 21)
    val dataUser = DataUser("David", 21)

    println(user)
    println(dataUser)

    val dataDavid = DataUser("David Nasrulloh", 22)
//    val name = dataDavid.component1()
//    val umur = dataDavid.component2()
    val (name, umur) = dataDavid

    println("My name is $name dan umur saya adalah $umur")

    val perkenalanDavid = DataPerkenalan("David Nasrulloh", "Jombang")
    perkenalanDavid.intro()

}