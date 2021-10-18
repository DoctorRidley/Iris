package models

class Iris(sw: Double, sl: Double, pw: Double, pl: Double, s: String) {

    private val sepal_width: Double = sw
    private val sepal_length: Double = sl
    private val petal_width: Double = pw
    private val petal_length: Double = pl
    private val species: String = s

    def Sepal_Width(): Double = sepal_width
    def Sepal_Length(): Double = sepal_length
    def Petal_Width(): Double = petal_width
    def Petal_Length(): Double = petal_length
    def Species(): String = species

    override def toString: String = "\'{" +
        s"\"sepal_width\":$sepal_width," +
        s"\"sepal_length\":$sepal_length," +
        s"\"petal_width\":$petal_width," +
        s"\"petal_length\":$petal_length," +
        s"\"species\":\"$species\"}\'"
}
