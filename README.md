# Use SBT to generate code that generates code

This project illustrates how to generate Scala code that generates Scala code.

## Generator project

`generator-project` uses [Twirl](https://github.com/spray/twirl) to generate, from Twirl file `generator-project/src/main/twirl/com/franklinchen/generated/HelloGenerator.scala.txt`, a Scala code file `src_managed/main/generated-twir-sources/com/franklinchen/generated/txt/HelloGenerator.template.scala` and then compile that to a class `com.franklinchen.generated.HelloGenerator`.

## Main project

The main project then calls a driver Scala program in `generator-project` that uses `com.franklinchen.generated.HelloGenerator` to generate `src_managed/main/com/franklinchen/Hello.scala` and then compile that to a class `com.franklinchen.Hello` used in the project.
