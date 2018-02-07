package $package$.$name;format="word"$

import org.scalatest._

class MainSpec extends FlatSpec with Matchers {
  "The main object" should "exist" in {
    Main.getMsg shouldEqual "MORO"
  }

  "The main object" should "exist" taggedAs ExternalSpec in {
    "not run on default" shouldEqual "not run on default"
  }
}
