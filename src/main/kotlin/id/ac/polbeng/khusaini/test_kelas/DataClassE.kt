package id.ac.polbeng.khusaini.test_kelas

fun main() {
    val puteri = Student("Puteri", 21)

    //Destructuring Declaration
    val(name, age) = puteri
    println("Name = $name")
    println("Age = $age")
}