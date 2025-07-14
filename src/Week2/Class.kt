package Week2

class Circle(val radius: Double){
    fun area(): Double {
        return Math.PI * radius * radius
    }
}
// Extension Function (function outside class)
fun Circle.perimeter(): Double {
    return  2 * Math.PI * radius
}
fun String.up(): String{
    return this.uppercase()
}
fun main(){
    val circle = Circle(2.5)
    println(circle.area())
    println(circle.perimeter())
    println("cs kmitl".up())


}