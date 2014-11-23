// http://projecteuler.net/problem=10

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

// Find the sum of all the primes below two million.
package com.ryanponeill.euler

object Problem10 {
  import Euler._

  def main(args: Array[String]) {
    println(go(10))
    println(go(1000))
    println(go(10000))
    println(go(100000))
    println(go(2000000))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "Sum of primes below %d: "
    getOutput(output, sumPrimes)(n)
  }

  def sumPrimes(n: Long): Long =
    numsFromUntil(2,n).filter(isPrime).sum
}
