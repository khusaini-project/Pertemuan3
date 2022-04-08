package id.ac.polbeng.khusaini.test_kelas

fun main() {
    //membuat instance interface
    var programmer: Human = object : Human {
        override fun think() { //mengoverride method think()
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

//interface Human
interface Human {
    fun think()
}