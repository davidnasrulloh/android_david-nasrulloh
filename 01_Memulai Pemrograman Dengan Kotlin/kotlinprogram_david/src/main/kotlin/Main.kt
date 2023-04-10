fun main(args: Array<String>) {
    println("Hello World!")
    val name = "Alfian"
    print("HelloWord")
    val firstChar = name[0]
    println("Huruf pertama dari $name adalah $firstChar")
    for(char in name){
        print("$char")
    }
    println(name)

    var myName:String = "David Nasrulloh"
    println(myName)

    val nilaiA:Int = 20
    val nilaiB:Int = 30

    println(nilaiA+nilaiB)

    var charDavid:Char = 'D'
    println(charDavid)

    println("==========")
    fun setUser(name:String, age:Int): String{
        return "Nama kamu adalah $name , dan umurmu saat ini adalah $age"
    }

    val user1 = setUser("david Nasrulloh", 22)
    println(user1)

//    println("Program arguments: ${args.joinToString()}")
}