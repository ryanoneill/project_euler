// http://projecteuler.net/problem=1

// If we list all the natural numbers below 10 that are multiples of 3 or 5, 
// we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.
package com.ryanponeill.euler

import Euler._

object Problem01 {
  def main(args: Array[String]) {
    println(go(10))
    println(go(100))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "Sum of [3,5] multiples below %d: "
    getOutput(output, multipleSum)(n)
  }

  def multipleSum(n: Long): Long = 
    numsFromUntil(1,n).filter(isMultipleOf(List(3,5))).sum
}
