// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Cake i IceCream koje nasljeduju Dessert. Kolac, uz
sve atribute iz klase Dessert ima i atribute containsGluten (boolean)
i cakeType (String, moze biti "birthday", "wedding", "regular" i sl.).
Sladoled ima dodatne atribute flavour (String) i color (String).
Napravite get i set metoda za svaki atribut, kao i metodu toString koja
vraca sve sto vraca i metoda toString iz klase Dessert, a dodatno jos i
atribute za izvedenu klasu. Napisite javnu metodu getDessertType u svakoj
od izvedenih klasa, koja ce za program s kojim cete testirati sve zadane
funkcionalnosti.
 */
class IceCream(name: String, weight: Double, calories: Int, private var flavour: String, private var color: String): Dessert(name, weight, calories) {
    fun setFlavour(flavour: String) {
        this.flavour = flavour
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getFlavour(): String = this.flavour

    fun getColor(): String = this.color

    override fun toString(): String = super.getDessertType() + "\nFlavour: ${this.flavour}\nColor: ${this.color}"

    override fun getDessertType() = "ice cream"
}