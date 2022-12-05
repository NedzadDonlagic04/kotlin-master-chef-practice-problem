// Underneath is the description of the practice problem in Bosnian
/*
Nastavnici se natjecu u fakultetskom "Master Chef" natjecanju, u kojem
svaki nastavnik priprema jedan desert, a studenti ih ocjenjuju. Za to
cemo napraviti klasu Competition Entry koja sadrzi referencu na jedan
objekt tipa Teacher (osoba koja je pripremila desert), referencu na jedan
objekt tipa Dessert, te polje referenci na studente koji su ocijenili dani
desert i polje ocjena koje su dali (predpostavite da 3 studenta ocjenjuju
jedan desert). Napisite konstruktor koji prima referencu na nastavnika i
desert, sve gettere te metodu addRating koja ima parametre Student i cijeli
broj (grade), a vraca boolean ovisno o tome je li uspjela ili ne ubaciti novi
zapis u dani CompetitionEntry (najvise tri ratinga i studenti se ne smiju
ponavljati). Napisite i metodu getRating koja vraca prosjecnu ocjenu svih
ocjenu svih studenata koji su ocjenili neki CompetitionEntry.
 */
class CompetitionEntry(private val teacher: Teacher, private val dessert: Dessert) {
    private val students = ArrayList<Student>()
    private val grades= ArrayList<Int>()

    fun getTeacher(): Teacher = this.teacher

    fun getDessert(): Dessert = this.dessert

    fun getStudents(): ArrayList<Student> = this.students

    fun getGrades(): ArrayList<Int> = this.grades

    private fun checkStudentRepetition(s: Student): Boolean {
        for(student in this.students) {
            if(s == student) {
                return true
            }
        }
        return false
    }

    fun addRating(student: Student, grade: Int): Boolean {
        if(this.students.size == 3) return false
        else if(checkStudentRepetition(student)) return false

        this.students.add(student)
        this.grades.add(grade)

        return true
    }

    fun getRating(): Double {
        if(this.students.size == 0) return 0.0

        return this.grades.sum() / this.grades.size.toDouble()
    }
}