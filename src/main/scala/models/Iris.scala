package models

/**
 * Iris temporarily stores and verify data
 * before pushing it to MongoDB
 * @param sl sepal_length
 * @param sw sepal_width
 * @param pl petal_length
 * @param pw petal_width
 * @param s species
 */

class Iris(sl: Double, sw: Double, pl: Double, pw: Double, s: String) {

    private val sepal_length: Double = sl
    private val sepal_width: Double = sw
    private val petal_length: Double = pl
    private val petal_width: Double = pw
    private val species: String = s

    def Sepal_Width(): Double = sepal_width
    def Sepal_Length(): Double = sepal_length
    def Petal_Width(): Double = petal_width
    def Petal_Length(): Double = petal_length
    def Species(): String = species

    override def toString: String = "\'{" +
        s"\"sepal_length\":$sepal_width," +
        s"\"sepal_width\":$sepal_length," +
        s"\"petal_length\":$petal_width," +
        s"\"petal_width\":$petal_length," +
        s"\"species\":\"$species\"}\'"
}
