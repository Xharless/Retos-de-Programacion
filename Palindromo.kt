fun palindromo(text: String): Boolean{
    val textLowerCase = text.lowercase()
    val textUnido = textLowerCase.replace(Regex("[^a-zA-ZáéíóúÁÉÍÓÚÑñ0-9]"), "")  
    if(textUnido == textUnido.reversed()){
        return true
    } else {
        return false
    }
}


fun main(){
    println(palindromo("Ana lleva al oso la avellana."))
}