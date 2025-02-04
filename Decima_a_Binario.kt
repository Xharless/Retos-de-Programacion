fun decimalToBinary(number: Int): String{
    var num = number
    var binary = ""
    while(num!=0){
        binary+=num%2
        num/=2
    }
    return binary.reversed()


}
fun main(){
    println(decimalToBinary(15))
    println(decimalToBinary(0))
}