package Week2

fun main(args: Array<String>){
//    println(args.contentToString())
//    for( i in 0 ..args.lastIndex) println("${args[i]}")

}
fun lecture(){
    // Lambda
    //               type ที่ส่ง -> type ที่return
    val waterFIlter: (Int) -> Int = {level -> level / 2}
    println(waterFIlter(20))

    //Higher Order functions
    fun encodeMsg(msg: String, encode: (String) -> String): String
    {

        return encode(msg)

    }

    // Filter
    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' })
    // output: [biology, birds]

    // Eager Filters
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager)

    // Lazy Filters
    val instruments1 = listOf("viola", "cello", "violin")
    val filtered = instruments1.asSequence().filter { it[0] == 'v'}
    println("filtered: " + filtered)
}