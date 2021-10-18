package models

import org.scalatest.FunSuite

class IrisSpec extends FunSuite {

    test("Iris toString Override") {

        def Override_Test(sw: Double, sl: Double, pw: Double, pl: Double, s: String): String = s"\'{" +
          s"\"sepal_width\":$sw," +
          s"\"sepal_length\":$sl," +
          s"\"petal_width\":$pw," +
          s"\"petal_length\":$pl," +
          s"\"species\":\"$s\"}\'"

        val test1 = new Iris(1.0, 1.0, 1.0, 1.0, "Test")
        val target1 = Override_Test(1.0, 1.0, 1.0, 1.0, "Test")

        assert(target1 == test1.toString)

        val test2 = new Iris(123, 10, 3.1, 12, "Test")
        val target2 = Override_Test(123, 10, 3.1, 12.0, "TeSt")

        assert(target2 != test2.toString)
    }

    test("Test Getters") {

        val test1 = new Iris(1.0, 12.5, 1125.25, 841.0, "Test")

        assert(test1.Sepal_Width() == 1.0)
        assert(test1.Sepal_Length() == 12.5)
        assert(test1.Petal_Width() == 1125.25)
        assert(test1.Petal_Length() == 841.0)
        assert(test1.Species() == "Test")

        val test2 = new Iris(-10, 0, 6854.65881, 84569.6548, "I am mad scientist")

        assert(test2.Sepal_Width() == -10)
        assert(test2.Sepal_Length() == 0)
        assert(test2.Petal_Width() == 6854.65881)
        assert(test2.Petal_Length() == 84569.6548)
        assert(test2.Species() != "I am sad scientist")
    }
}
