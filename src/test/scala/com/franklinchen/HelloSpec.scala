package com.franklinchen

import org.specs2._

class HelloSpec extends Specification { def is = s2"""
  Hello
    
    hello program is generated and compiles and runs $e1
  """

  def e1  = {
    Hello.result === "hello world"
  }
}
