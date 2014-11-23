// http://projecteuler.net/problem=6

// The sum of the squares of the first ten natural numbers is,

// 1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,

// (1 + 2 + ... + 10)^2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
package com.ryanponeill.euler

object Problem06 {
  import Euler._

  def main(args: Array[String]) {
    println(go(10))
    println(go(100))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "Difference of Squares of 1 to %d: "
    getOutput(output, diffSquaresOf)(n)
  }

  def diffSquaresOf(n: Long): Long =
    diffSquares(numsFromTo(1,n))
}
