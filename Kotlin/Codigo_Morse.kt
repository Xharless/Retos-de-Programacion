fun convercion(text: String): String{
    val textToMorse = mapOf("A" to ".—", "N" to "—.", "0" to "—————",
    "B" to "—...", "Ñ" to "——.——", "1" to ".————",
    "C" to "—.—.", "O" to "———", "2" to "..———",
    "P" to ".——.", "3" to "...——",
    "D" to "—..", "Q" to "——.—", "4" to "....—",
    "E" to ".", "R" to ".—.", "5" to ".....",
    "F" to "..—.", "S" to "...", "6" to "—....",
    "G" to "——.", "T" to "—", "7" to "——...",
    "H" to "....", "U" to "..—", "8" to "———..",
    "I" to "..", "V" to "...—", "9" to "————.",
    "J" to ".———", "W" to ".——", "." to ".—.—.—",
    "K" to "—.—", "X" to "—..—", "," to "——..——",
    "L" to ".—..", "Y" to "—.——", "?" to "..——..",
    "M" to "——", "Z" to "——..", "\"" to ".—..—.", "/" to "—..—.")
    
    var morse = ""

    //lenguaje natural 
    if(text.contains("[a-zA-Z0-9]".toRegex())){
        var morse = ""
        for(i in text){
            if(i!=' '){
                morse+=textToMorse[i.toString().uppercase()]
            } else {
                morse+=" "
            }
        }
        return morse
    } 

    
}



fun main(){
    var texto = "Hola mundo"
    var morse = convercion(texto)
    println(morse)
}