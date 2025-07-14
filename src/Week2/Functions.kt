package Week2

fun main(args: Array<String>){
//    println(args.contentToString())
//    for( i in 0 ..args.lastIndex) println("${args[i]}")
//    println(compactfun(2))

    val enc1: (String) -> String = { input -> input.uppercase() }
    println(encodeMsg("cs kmitl" , enc1))
}

// compact function (param: type): type of return type = ...
fun compactfun(number: Int): Int = if (number < 0) number * -1 else number

//Higher Order functions
fun msgEncoder(msg: String, up: (String) -> String): String{
    return up(msg)
}
fun encodeMsg(msg: String, enc1: (String) -> String): String {
    println("Hi")
    return enc1(msg)
}


fun lecture(){
    // Lambda
    val message = {msg: String -> msg.uppercase()}
    println(message("hello world"))

    // Lambda that can define paremeter types and return types
    //               (parameter type) -> return type = {...}
    val waterFilter: (Int) -> Int = {level -> level / 2}
    println(waterFilter(20))


    // Filter
    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' })
    // output: [biology, birds]
    // flatten
    val list = listOf(setOf(2, 4), setOf(5, 6))
    println(list.flatten())
//    output: [2, 4, 5, 6]

    // Eager Filters
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager)

    // Lazy Filters
    val instruments1 = listOf("viola", "cello", "violin")
    val filtered = instruments1.asSequence().filter { it[0] == 'v'}
    println("filtered: " + filtered)
}