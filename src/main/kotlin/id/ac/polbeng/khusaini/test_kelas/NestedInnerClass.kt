package id.ac.polbeng.khusaini.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested { //kelas Nested di deklarasikan didalam kelas Outer
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

//jalankan program
fun main(args: Array<String>) {
    //mengakses anggota Nested Class
    println(Outer.Nested().b)

    //membuat objek Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())
}