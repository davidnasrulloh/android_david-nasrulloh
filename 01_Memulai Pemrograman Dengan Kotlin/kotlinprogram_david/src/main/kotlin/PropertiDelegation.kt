import kotlin.reflect.KProperty

//only for string
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String{
        println("Fungsi ini sama seperti getter ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// for all
class DelegateGenericClass{
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// create class
class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name:String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}


fun main(){

    val animal = Animal()
    animal.name = "Kucing wow"
    println("Nama hewan ${animal.name}")

    val person = Person()
    person.name = "David Nasrulloh"
    println("Nama person ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama hero ${hero.name}")


    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 10

    println("Nama : ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur : ${animal.age} Tahun")


}