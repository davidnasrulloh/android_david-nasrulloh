fun main (){
    val numberList: List<Int> = listOf(1,2,3,4)
    val anyList = mutableListOf('a', "Kotlin", 3, true, "Hehehe")

    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0

}