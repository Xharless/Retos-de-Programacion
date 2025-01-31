fun contador(text: String){
    val textLower = text.lowercase()
    val textSplit = textLower.split(Regex("\\W+")) //separar y eliminar la puntuacion
    val myMap = mutableMapOf<String, Int>()
    for(i in textSplit){
        if(myMap[i] != null){
            myMap[i] = myMap.getValue(i) + 1
        } else {
            myMap[i] = 1
        }
    }
    println(myMap)
}


fun main(){
    contador("Mi nombre es Carlos, y mi nombre completo es Carlos Andres")
}