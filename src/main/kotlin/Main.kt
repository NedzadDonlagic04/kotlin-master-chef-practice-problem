fun main(args: Array<String>) {
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
}