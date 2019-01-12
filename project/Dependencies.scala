import sbt._

object Dependencies {
  val `scala-2-12` = "2.12.8"
  val testV = "3.0.4"

  object Testing {
    val scalastic = "org.scalactic" %% "scalactic" % testV withSources()
    val scalatest = "org.scalatest" %% "scalatest" % testV withSources()
  }

  object Avro {
    val avro = "org.apache.avro" % "avro" % "1.8.2" withSources()
  }

  object Magnolia {
    val magnolia = "com.propensive" %% "magnolia" % "0.10.0" withSources()
  }

}
