package io.sqooba

import org.scalatest._

class MainSpec extends FlatSpec with Matchers {
  "The main object" should "exist" in {
    Hello.getMsg shouldEqual "MORO"
  }
}