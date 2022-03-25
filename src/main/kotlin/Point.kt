import java.lang.Math.sqrt

class Point constructor(x: Double, y: Double){

    var x: Double = x
    var y: Double = y


    //    Task 1
    fun toStringFunction(): String {
        return "x = $x, y = $y"
    }

//    Task 2

    override fun equalsFunction(other: Any?): Boolean {
        if (other !is Point || other == null) {
            return false
        }
        return y == other.y && x == other.x
    }
//    Task 3

    fun transform() {
        x = -x
        y = -y
    }
//    Task 4

    fun distanceBetweenPoints(secondPoint: Point): Double {
        return sqrt((((x - secondPoint.x)*(x - secondPoint.x))-((y - secondPoint.y)*(y - secondPoint.y))))
    }

}