import kotlin.math.*
import java.lang.Math


fun Armstrong(number: Int) {
    if(number < 0){
        println("No es numero de Armstrong")
    } else {
        var num = number.toString()
        var largo = num.length
        var suma = 0.0
        for(i in num){
            var result = i.digitToInt()
            suma += Math.pow(result.toDouble(), largo.toDouble())
        }
        if(suma.toInt() == number){
            println("Es numero de Armstrong")
        } else {
            println("No es numero de Armstrong")
        }
    }
}

fun main(){
    Armstrong(371)
    Armstrong(-371)
    Armstrong(372)
    Armstrong(0)
}