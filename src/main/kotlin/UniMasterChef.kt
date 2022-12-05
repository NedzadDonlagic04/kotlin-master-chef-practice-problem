// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu UniMasterChef koja sadrzi polje referenci tipa
CompetitionEntry, metodu addEntry (po uzoru na metodu addRating),
metodu getBestDessert koja ce vratiti najbolje ocijenjeni desert,
kao i staticku metodu getInvolvedPeople koja prima argument tipa
CompetitionEntry, a vraca referencu na polje osoba koje su sudjelovale
u izradi ili ocjenjivanju kolaca. Konstruktor za UniMasterChef prima
jedan cijeli broj (broj prijava na natjecanje). Napisite metodu main
u kojoj cete testirati danu funkcionalnost.
Za isjecak koda:
    val genericDessert = Dessert("Chocolate Mousse", 120.00, 300)
    val cake = Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday")

    val t1 = Teacher("Dario", "Tusek", 42, "dario.tusek@fer.hr", "OOP", 10000.00)
    val t2 = Teacher("Doris", "Bezmalinovic", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000.00)

    val s1 = Student("Janko", "Horvat", 18, "0036312123", 1)
    val s2 = Student("Ana", "Kovac", 19, "0036387656", 2)
    val s3 = Student("Ivana", "Stanic", 19, "0036392357", 1)

    val competition = UniMasterChef(2)
    val e1 = CompetitionEntry(t1, genericDessert)
    competition.addEntry(e1)

    println("Entry 1 rating: " + e1.getRating())

    e1.addRating(s1, 4)
    e1.addRating(s2, 5)

    println("Entry 1 rating: " + e1.getRating())

    val e2 = CompetitionEntry(t2, cake)
    e2.addRating(s1, 4)
    e2.addRating(s3, 5)
    e2.addRating(s2, 5)

    competition.addEntry(e2)
    println("Entry 2 rating: " + e2.getRating())
    println("Best dessert is: " + competition.getBestDessert().getName())

    val e2person = UniMasterChef.getInvolvedPeople(e2)
    for(p in e2person)
        println(p)
Ocekuje se sljedeci ispis:
Entry 1 rating: 0.0
Entry 1 rating: 4.5
Entry 2 rating: 4.666666666666667
Best dessert is: Raspberry chocolate cake #3
Doris Bezmalinovic, age=43, email=doris.bezmalinovic@fer.hr, subject=OOP, salary: 10000.0
Janko Horvat, age=18, studentId=0036312123, academicYear=1
Ivana Stanic, age=19, studentid=0036392357, academicYear=1
Ana Kovac, age=19, studentId=0036387656, academicYear=2
 */
class UniMasterChef(private val size: Int) {
    private val competitions = ArrayList<CompetitionEntry>()

    fun addEntry(competition: CompetitionEntry): Boolean {
        if(this.competitions.size == this.size) return false

        this.competitions.add(competition)
        return true
    }

    fun getBestDessert(): Dessert {
        var best = 0
        for(i in 1 until this.competitions.size) {
            if(this.competitions[best].getRating() < this.competitions[i].getRating()) {
                best = i
            }
        }
        return this.competitions[best].getDessert()
    }

    companion object {
        fun getInvolvedPeople(competition: CompetitionEntry): ArrayList<Person> {
            val peopleInvolved= ArrayList<Person>()
            peopleInvolved.add(competition.getTeacher())

            for(student in competition.getStudents()) {
                peopleInvolved.add(student)
            }

            return peopleInvolved
        }
    }
}