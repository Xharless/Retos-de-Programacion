fun factorial(number: Int): Int?{
    return if(number < 0) null else if (number<=1) 1 else number * (factorial(number-1)!!)
    
}

fun main(){
    println(factorial(10))
}