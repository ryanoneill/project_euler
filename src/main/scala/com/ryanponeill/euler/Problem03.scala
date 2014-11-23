// http://projecteuler.net/problem=3

// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?
package com.ryanponeill.euler

object Problem03 {
  import Euler._

  def main(args: Array[String]) {
    //val number = 13195
    val number = 600851475143L
    println(maxPrimeFactorOf(number))
  }

  def maxPrimeFactorOf(n: Long): Long =
    factorsOf(n).filter(isPrime).max

}
