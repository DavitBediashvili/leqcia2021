class Point(private var x : Int, private var y : Int){

    private var firstCoordinate: Int = x
    private var secondCoordinate: Int = y

    fun theSymmetry(): Pair<Int, Int>{
        return Pair(firstCoordinate * -1, secondCoordinate * -1)
    }
}

fun main() {

    var d1 = Point(5, 7)
    var d2 = Point(22, 12)

    println(d1.theSymmetry())
    println(d2.theSymmetry())

    println(d1.toString())
    println(d2.toString())

    println(d1.equals(d2))
}