organization := "com.franklinchen"

version := "1.0.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.10.1" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test"
)

// http://stackoverflow.com/questions/11509843/sbt-generate-code-using-project-defined-generator
sourceGenerators in Compile <+= (sourceManaged in Compile, dependencyClasspath in Runtime in generatorProject) map {
  (sourceManagedValue, dependencyClasspathValue) => generateMyScalaCode(sourceManagedValue, dependencyClasspathValue) }
