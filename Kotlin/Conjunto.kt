fun isConjunto(list1: List<Int>,list2: List<Int>, comando:Boolean){
    for(i in list1){
        if(comando){
            if (i in list2){
                println(i)
            }
        } else {
            if (i !in list2){
                println(i)
            }
        }
    }
}


fun main(){
    isConjunto(listOf(1, 2, 3, 3, 4), listOf(2, 2, 3, 3, 3, 4, 6), true)
    println("\n")
    isConjunto(listOf(1, 2, 3, 3, 4), listOf(2, 2, 3, 3, 3, 4, 6), false)
}