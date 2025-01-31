
fun esPrimo(number: Int): Boolean{
    if(number<2){
        return false
    }

    // El until es lo mismo que hacer number-1, y necesitamos eso ya que si dividimos el numero por si mismo no cuenta
    for(i in 2 until number){
        if(number%i==0){
            return false
        }
    }

    return true
}



fun main(){
    (1..100).forEach{number->
        if(esPrimo(number)){
            println(number)
        }
    }
}