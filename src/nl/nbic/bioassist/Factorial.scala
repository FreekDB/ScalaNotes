package nl.nbic.bioassist

object Factorial extends App {
  def factorial(n: BigInt): BigInt =
    if (n <= 0) 1 else n * factorial(n - 1)

  // Everyone likes 42.
  val n = 42
  println(n + "! = " + factorial(n))
}
