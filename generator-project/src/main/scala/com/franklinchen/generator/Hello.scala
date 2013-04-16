package com.franklinchen.generator

import com.franklinchen.txt.HelloGenerator

object Hello extends App {
  val message = "hello world"

  print(HelloGenerator(message).toString)
}