package id.ac.polbeng.khusaini.test_kelas

//contoh inner class
class OuterA {
    val a = "Outside Nested class."
    inner class Inner { //class Inner didalam class Outer
        fun callMe() = a
    }
}

//jalankan program
fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")
}