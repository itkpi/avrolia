import Dependencies._

lazy val v: String = "0.0.1"

lazy val kernel = Project(id = "avrolia-kernel", base = file("./kernel"))
  .settings(libraryDependencies ++= {
    Seq(
      Avro.avro,
      Magnolia.magnolia,
      Testing.scalastic,
      Testing.scalatest
    )
  })

lazy val root = Project(id = "avrolia", base = file("."))
  .aggregate(
    kernel
  )
  .settings(name := "avrolia",
            version := v,
            scalaVersion := `scala-2-12`,
            crossScalaVersions := Seq(`scala-2-12`),
            scalacOptions += "-Ypartial-unification")
