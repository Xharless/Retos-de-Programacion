fun fibonacci(number: Int){
    var n0: Long = 0
    var n1: Long = 1
    // como no trabajamos con el numero, lo colocamos con guion bajo
    (1..number).forEach{ _ ->
        println(n0)
        var fib = n0 + n1
        n0 = n1
        n1 = fib
    }

}

fun main(){
    fibonacci(50)
}