import Dependencies._

enablePlugins(ScalaJSPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.rhdzmota",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scalajs-hello-world",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"
  )
