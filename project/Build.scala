import sbt._
import Keys._

object MultiBuild extends Build {
  lazy val parent = Project(id = "test-multi",
    base = file(".")) dependsOn(generatorProject)

  lazy val generatorProject = Project(id = "generator-project",
    base = file("generator-project"))

  // TODO Generate from more inputs, to more outputs
  def generateMyScalaCode(sourceManagedValue: File,
                          dependencyClasspathValue: Classpath) = {
    val dir = sourceManagedValue / "com" / "franklinchen"
    dir.mkdirs()

    val file = dir / "Hello.scala"
    val output = new java.io.FileOutputStream(file)

    val i = new Fork.ForkScala("com.franklinchen.generator.Hello").
      fork(None,
        Nil,
        dependencyClasspathValue.files,
        Nil,
        None,
        false,
        CustomOutput(output)).exitValue()
    if (i != 0) {
      error("Failed to generate " + file)
    }

    Seq(file)
  }
}
