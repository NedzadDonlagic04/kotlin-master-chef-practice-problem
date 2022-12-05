// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu Dessert koja ima sljedece privatne atribute: name(String),
weight(double) i calories(int). Dodajte klasi konstruktor koji prima kao
parametre vrijednosti za sva 3 atributa. Napravite get i set metode za svaki
atribut, te nadjacajte metodu toString. Napisite i javnu metodu getDessertType
koja nema argumenata a vraca string "dessert".
 */
open class Dessert(private var name: String, private var weight: Double, private var calories: Int) {
    fun setName(name: String) {
        this.name = name
    }

    fun setWeight(weight: Double) {
        this.weight = weight
    }

    fun setCalories(calories: Int) {
        this.calories = calories
    }

    fun getName(): String = this.name

    fun getWeight(): Double = this.weight

    fun getCalories(): Int = this.calories

    override fun toString(): String = "Name: ${this.name}\nWeight: ${this.weight} kg\nCalories: ${this.calories} kcal"

    open fun getDessertType() = "dessert"
}