// http://projecteuler.net/problem=7

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

// What is the 10 001st prime number?

object Problem07 {
  def main(args: Array[String]) {
    val numbers = (2 to 1000000).toList
    println("6th Prime Number: " + nthPrime(6, numbers))

    println("10,001st Prime Number: " + nthPrime(10001, numbers))
  }

  def nthPrime(index: Int, numbers: List[Int]): Int = {
    numbers match {
      case x :: xs => if (index == 1) x else nthPrime(index - 1, xs.filter(y => y % x != 0))
      case _       => throw new IllegalArgumentException
    }
  }
}