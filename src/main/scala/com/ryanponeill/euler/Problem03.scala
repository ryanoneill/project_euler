// http://projecteuler.net/problem=3

// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?
package com.ryanponeill.euler

object Problem03 {
  import Euler._

  def main(args: Array[String]) {
    println(go(13195))
    println(go(600851475143L))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "The largest prime factor of %d: "
    getOutput(output, maxPrimeFactorOf)(n)
  }

  def maxPrimeFactorOf(n: Long): Long =
    factorsOf(n).filter(isPrime).max

}
