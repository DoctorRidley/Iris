package models

import org.scalatest.FunSuite

class IrisSpec extends FunSuite {

    test("Iris toString Override") {

        def Override_Test(sl: Double, sw: Double, pw: Double, pl: Double, s: String): String = s"\'{" +
            s"\"sepal_length\":$sl," +
            s"\"sepal_width\":$sw," +
            s"\"petal_length\":$pl," +
            s"\"petal_width\":$pw," +
            s"\"species\":\"$s\"}\'"

        val test1 = new Iris(1.0, 1.0, 1.0, 1.0, "Test")
        val target1 = Override_Test(1.0, 1.0, 1.0, 1.0, "Test")

        assert(target1 == test1.toString)

        val test2 = new Iris(123, 10, 3.1, 12, "Test")
        val target2 = Override_Test(123, 10, 3.1, 12.0, "TeSt")

        assert(target2 != test2.toString)
    }

    test("Test Getters") {

        val test1 = new Iris(1.0, 12.5, 1125.25, 841.0, "I am mad scientist")

        assert(test1.Sepal_Length() == 1.0)
        assert(test1.Sepal_Width() == 12.5)
        assert(test1.Petal_Length() == 1125.25)
        assert(test1.Petal_Width() == 841.0)
        assert(test1.Species() == "I am mad scientist")

        val test2 = new Iris(-10, 0, 6854.65881, 84569.6548, "Okabe Rintaro")

        assert(test2.Sepal_Length() == -10)
        assert(test2.Sepal_Width() == 0)
        assert(test2.Petal_Length() == 6854.65881)
        assert(test2.Petal_Width() == 84569.6548)
        assert(test2.Species() != "Hououin Kyouma")
    }
}
