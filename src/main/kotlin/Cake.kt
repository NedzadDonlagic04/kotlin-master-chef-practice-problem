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
class Cake(name: String, weight: Double, calories: Int, private var containsGluten: Boolean, private var cakeType: String): Dessert(name, weight, calories) {
    fun setContainsGluten(containsGluten: Boolean) {
        this.containsGluten = containsGluten
    }

    fun setCakeType(cakeType: String) {
        this.cakeType = cakeType
    }

    fun getContainsGluten(): Boolean = this.containsGluten

    fun getCakeType(): String = this.cakeType

    override fun toString(): String = super.getDessertType() + "\nContains Gluten: ${this.containsGluten}\nCake Type: ${this.cakeType}"

    override fun getDessertType() = "cake"
}