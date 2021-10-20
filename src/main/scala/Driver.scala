import repos.CRUDRepo
import services.FileService

object Driver {

    def main(args: Array[String]): Unit = {
        val f: FileService = new FileService("iris.data")
        f.Read_File()

        CRUDRepo.Close()
    }
}
