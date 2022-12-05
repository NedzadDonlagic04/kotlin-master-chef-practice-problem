// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu Person koja opisuje neku osobu. Person sadrzi atribute
name (String), surname (String), age (int). Napisite konstruktor, get
i set metode, te metode toString i equals (dvije osobe su jednake ako
imaju isto ime i prezime te broj godina).
 */
open class Person(private var name: String, private var surname: String, private var age: Int) {
    fun setName(name: String) {
        this.name = name
    }

    fun setSurname(surname: String) {
        this.surname = surname
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getName(): String = this.name

    fun getSurname(): String = this.surname

    fun getAge(): Int = this.age

    override fun toString(): String = "${this.name} ${this.surname}, age=${this.age}"

    override fun equals(other: Any?): Boolean {
        if(other is Person) {
            return (this.name === other.name && this.surname === other.surname && this.age == other.age)
        }
        return false
    }
}