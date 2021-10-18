package services

import models.Iris
import repos.CRUDRepo

import scala.io.{BufferedSource, Source}

/**
 * FileService is responsible for reading and parsing a CSV or JSON file
 * and converting it into a format the application can understand
 */
class FileService(file: String) {

    private var file_data: BufferedSource = null

    def Read_File(): Unit = {
        // read file into array

        file_data = Source.fromFile(file)
    }
}
