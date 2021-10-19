package repos

import models.Iris
import org.mongodb.scala._
import org.mongodb.scala.model.Filters.{and, equal}

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

    def Read_Iris(i: Iris): Iris = {

        // FIX ME: may not need all properties
        val record: FindObservable[Document] = iris.find(and(
            equal("sepal_width", i.Sepal_Width()),
            equal("sepal_length", i.Sepal_Length()),
            equal("petal_width", i.Petal_Width()),
            equal("petal_length", i.Petal_Length()),
            equal("species", i.Species())
        ))

        //val observable: Observable[Completed]

        return null
    }

    def Update_Iris(i: Iris): Unit = {
        val old_iris: Iris = Read_Iris(i)
    }

    def Delete_Iris(i: Iris): Unit = {

    }

    def Close(): Unit = client.close()
}
