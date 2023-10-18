lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-hello-world-tutorial""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    crossScalaVersions := Seq("2.13.12"),
    scalaVersion := crossScalaVersions.value.head,
    libraryDependencies ++= Seq(
      guice,
       "org.webjars" % "swagger-ui" % "4.17.1",
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-Werror"
    )
  )
