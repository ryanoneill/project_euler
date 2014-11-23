// http://projecteuler.net/problem=6

// The sum of the squares of the first ten natural numbers is,

// 1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,

// (1 + 2 + ... + 10)^2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

object Problem06 {
  def main(args: Array[String]) {
    println("Difference of Squares of 1 to 10: " + diffSquaresFromTo(1,10))
    println("Difference of Squares of 1 to 100: " + diffSquaresFromTo(1,100))
  }

  def square(x: Int): Int =
    x * x

  def numsFrom(n: Int): Stream[Int] =
    n #:: numsFrom(n+1)

  def numsFromTo(m: Int, n: Int): Stream[Int] =
    numsFrom(m).takeWhile(_ <= n)

  def diffSquares(xs: Stream[Int]): Int =
    square(xs.sum) - xs.map(square).sum

  def diffSquaresFromTo(m: Int, n: Int): Int =
    diffSquares(numsFromTo(m,n))
}
