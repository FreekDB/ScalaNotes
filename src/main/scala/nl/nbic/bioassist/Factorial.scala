package nl.nbic.bioassist

/**
 * The classic factorial function for big numbers, which looks a lot better in Scala than in Java.
 */
object Factorial extends App {
  override def main(args: Array[String]) = {
    // Everyone likes 42.
    val n = 42
    println(n + "! = " + factorial(n))
  }

  def factorial(n: BigInt): BigInt =
    if (n <= 0) 1 else n * factorial(n - 1)

}
