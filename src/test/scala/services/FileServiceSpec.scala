package services

import models.Iris
import org.scalatest.FunSuite

class FileServiceSpec extends FunSuite {

    test("Read From File") {

        val test1: FileService = new FileService("test.data")
        test1.Read_File()

        val target1: Array[Iris] = Array[Iris]()

        // TODO: FIGURE OUT SOME WAY TO CLEAN THIS UP
        target1 :+ new Iris(5.1,3.5,1.4,0.2, "Iris-setosa")
        target1 :+ new Iris(4.9,3.0,1.4,0.2, "Iris-setosa")
        target1 :+ new Iris(4.7,3.2,1.3,0.2, "Iris-setosa")
        target1 :+ new Iris(4.6,3.1,1.5,0.2, "Iris-setosa")
        target1 :+ new Iris(5.0,3.6,1.4,0.2, "Iris-setosa")

        println(test1.File_Data().toString)
        println(target1.toString)
        assert(test1.File_Data() == target1)


        val test2: FileService = new FileService("test2.data")
        test2.Read_File()

        val target2: Array[Iris] = Array[Iris]()

        // TODO: FIGURE OUT SOME WAY TO CLEAN THIS UP
        target2 :+ new Iris(5.2,2.7,3.9,1.4,"Iris-versicolor")
        target2 :+ new Iris(5.0,2.0,3.5,1.0,"Iris-versicolor")
        target2 :+ new Iris(5.9,3.0,4.2,1.5,"Iris-versicolor")
        target2 :+ new Iris(6.0,2.2,4.0,1.0,"Iris-versicolor")
        target2 :+ new Iris(6.1,2.9,4.7,1.4,"Iris-versicolor")
        target2 :+ new Iris(5.6,2.9,3.6,1.3,"Iris-versicolor")

        assert(test2.File_Data() == target2)
    }

    test("File Data Getter") {

    }
}
