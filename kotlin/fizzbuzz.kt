fun main(args: Array<String>){
    val message: String = "FizzBuzz Start"
    println(message);

    // 未初期化はKotlinだとエラーになる
    var ret: String = "null" 
    for(i in 1..100){
        println(ret)
        ret = fizzbuzz(i)
    }
}

fun fizzbuzz(value: Int): String {
    if(value % 15 == 0) return "FizzBuzz"
    return when {
        (value % 3 == 0) -> "Fizz"
        (value % 5 == 0) -> "Buzz"
        else -> value.toString()
    }
}