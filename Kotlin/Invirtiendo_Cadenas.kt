fun invertir(text: String) : String{
    var largo = text.length
    var palabra = ""
    for(i in largo-1 downTo 0){
        palabra+=text[i]
    }
    return palabra
}

fun main(){
    println(invertir("Hola mundo"))
}