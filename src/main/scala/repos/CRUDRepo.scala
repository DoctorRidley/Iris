package repos

import models.Iris

import org.mongodb.scala._

object CRUDRepo {

    val client: MongoClient = MongoClient()
    val db: MongoDatabase = client.getDatabase("Iris")
    val iris: MongoCollection[Document] = db.getCollection("iris")


    def Create_Iris(i: Iris): Unit = {

        val doc: Document = Document(
            "sepal_width" -> i.Sepal_Width(),
            "sepal_length" -> i.Sepal_Length(),
            "petal_width" -> i.Petal_Width(),
            "petal_length" -> i.Petal_Length(),
            "species" -> i.Species()
        )

        iris.insertOne(doc)
    }

    def Read_Iris(i: Iris): Unit = {

    }

    def Update_Iris(i: Iris): Unit = {

    }

    def Delete_Iris(i: Iris): Unit = {

    }
}
