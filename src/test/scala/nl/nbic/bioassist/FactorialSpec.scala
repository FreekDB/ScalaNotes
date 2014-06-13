package nl.nbic.bioassist

import org.scalatest._
import junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class FactorialSpec extends FlatSpec with ShouldMatchers {
  "The Factorial object" should "return the right value for 42!" in {
    Factorial.factorial(42) should equal (BigInt("1405006117752879898543142606244511569936384000000000"))
  }
}
