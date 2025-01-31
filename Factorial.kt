fun factorial(number: Int){
    var fact = 1
    for(i in number downTo 1){
        fact*=i
    }
    println("El resultado de $number! es $fact")
}


fun main(){
    factorial(10)
}