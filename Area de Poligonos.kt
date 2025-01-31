

fun main(){
    area(Triangulo(10.0, 5.0))
    area(Rectangulo(5.0, 7.0))
    area(Cuadrado(4.0))
}

interface Polygon{
    fun area(): Double
    fun printArea()
}

data class Triangulo(val base: Double, val altura: Double): Polygon{
    override fun area(): Double{
        return(base*altura)/2
    }
    override fun printArea(){
        println("El area del triangulo es ${area()}")
    }
}
data class Rectangulo(val base: Double, val altura: Double): Polygon{
    override fun area(): Double{
        return base*altura
    }
    override fun printArea(){
        println("El area del rectangulo es ${area()}")
    }
}
data class Cuadrado(val lado: Double): Polygon{
    override fun area(): Double{
        return lado*lado
    }
    override fun printArea(){
        println("El area del cuadrado es ${area()}")
    }
}

fun area(polygon: Polygon): Double{
    polygon.printArea()
    return polygon.area()
}