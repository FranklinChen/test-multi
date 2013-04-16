organization := "com.franklinchen"

version := "1.0.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.10.1" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test"
)

seq(Twirl.settings: _*)
