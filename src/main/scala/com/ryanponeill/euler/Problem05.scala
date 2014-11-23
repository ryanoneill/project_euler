// http://projecteuler.net/problem=5

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
package com.ryanponeill.euler

object Problem05 {
  import Euler._

  def main(args: Array[String]) {
    println(go(10))
    println(go(20))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "Lowest Common Multiple of 1 to %d: "
    getOutput(output, lcmOfUpTo)(n)
  }

  def lcmOfUpTo(n: Long): Long =
    numsFromTo(1,n).fold(1L)(lcm)
}
