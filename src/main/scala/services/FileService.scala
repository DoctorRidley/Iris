package services

import models.Iris
import repos.CRUDRepo

import scala.io.Source

/**
 * FileService is responsible for reading and parsing a CSV or JSON file
 * and converting it into a format the application can understand
 */
class FileService(path: String) {

    var file_data: Array[Iris] = Array[Iris]()

    def File_Data(): Array[Iris] = file_data

    def Read_File(): Unit = {

        val file = Source.fromResource(path)
        for (iris <- file.getLines()) {

            val values: Array[String] = iris.split(',')

            val new_iris = new Iris(
                values(0).toDouble,
                values(1).toDouble,
                values(2).toDouble,
                values(3).toDouble,
                values(4)
            )

            CRUDRepo.Create_Iris(new_iris)

            // Is it really that hard to memorize .add()
            // or some other function? I hate Scala
            // Keeping for unit testing purposes
            file_data :+ new_iris
        }
    }
}
