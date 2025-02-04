
fun Armstrong(number: Int): Boolean {
    if(number<0){
        return false
    }else{
        for(i in number){
            prinln(i)
        }
    }
}

fun main(){
    if(Armstrong(153)){

    } else{
        println("No es numero de Armstrong")
    }
}