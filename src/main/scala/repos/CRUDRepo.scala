package repos

import models.Iris
import org.mongodb.scala._
import org.mongodb.scala.model.Filters.{and, equal}

object CRUDRepo {

    val client: MongoClient = MongoClient()
    val db: MongoDatabase = client.getDatabase("Iris")
    val iris: MongoCollection[Document] = db.getCollection("data")

    def Create_Iris(i: Iris): Unit = {

        val doc: Document = Document(
            "sepal_length" -> i.Sepal_Length(),
            "sepal_width" -> i.Sepal_Width(),
            "petal_length" -> i.Petal_Length(),
            "petal_width" -> i.Petal_Width(),
            "species" -> i.Species()
        )

        val observable: Observable[Completed] = iris.insertOne(doc)

        observable.subscribe(new Observer[Completed] {
            override def onNext(result: Completed): Unit = {}
            override def onError(e: Throwable): Unit = {e.printStackTrace()}
            override def onComplete(): Unit = {}
        })
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
