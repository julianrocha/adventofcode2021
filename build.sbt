ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "adventofcode2021"

lazy val adventofcode2021 = (project in file("."))
  .settings(
    name := "adventofcode2021",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )