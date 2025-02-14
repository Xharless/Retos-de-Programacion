fun printNonCommon(str1: String, str2: String){
    var out1 = "" //presentes en str1 que no esten en str2
    var out2 = "" //presentes en str2 que no esten en str1

    for(i in str1){
        if(i.toString().lowercase() !in str2.lowercase()){
            out1+=i.toString()
        }
    }

    for(i in str2){
        if(i.toString().lowercase() !in str1.lowercase()){
            out2+=i.toString()
        }
    }



    println("Out1: $out1")
    println("Out2: $out2")
}


fun main(){
    printNonCommon("brais","moure")
    printNonCommon("Me gusta Java","Me gusta Kotlin")
}

