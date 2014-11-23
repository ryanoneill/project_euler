// http://projecteuler.net/problem=7

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

// What is the 10 001st prime number?
package com.ryanponeill.euler

object Problem07 {
  import Euler._

  def main(args: Array[String]) {
    println(go(6))
    println(go(10001))
  }

  def apply(n: Int): String = go(n)

  def go(n: Int): String = {
    val output = "nth Prime Number - %d: "
    getOutput(output, nthPrime)(n)
  }
}
