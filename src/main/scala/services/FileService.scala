package services

import models.Iris

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

            // Is it really that hard to memorize .add()
            // or some other function? I hate Scala
            file_data :+ new Iris(
                iris(0).toDouble,
                iris(1).toDouble,
                iris(2).toDouble,
                iris(3).toDouble,
                iris.substring(4)
            )
        }
    }

    def Push_File(): Unit = {
    }
}
