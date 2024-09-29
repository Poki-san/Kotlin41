//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val array = arrayOf("Ира", "Олег", "Иван", "Михаил", "Никита")
    val arrGroup = array.groupBy { it.first() }.toSortedMap()
    println(arrGroup)

    println("\nЗадание 2")
    val array2 = arrayOf("Ира", "Олег", "Иван", "Михаил", "Никита")
    val arrGroup2 = array2.groupBy { it.length }.toSortedMap()
    println(arrGroup2)

    println("\nЗадание 3")
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    val arrGroup3 = phoneToYear.groupBy { it.second }
    println(arrGroup3)

}