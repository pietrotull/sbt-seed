package $package$.$name;format="word"$

import org.scalatest._

class MainSpec extends FlatSpec with Matchers {
  "The main object" should "return a message" in {
    Main.getMsg shouldEqual "MORO"
  }

  "This test" should "only be run if using prefix: ext" taggedAs ExternalSpec in {
    "not run on default" shouldEqual "not run on default"
  }
}
