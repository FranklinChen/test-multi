package com.franklinchen

import org.specs2._

class HelloSpec extends Specification {
  def is =
    "hello program is generated and compiles and runs" ! e1 ^
  end

  def e1  = {
    Hello.result must_== "hello world"
  }
}
