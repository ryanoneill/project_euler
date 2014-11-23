// http://projecteuler.net/problem=4

// A palindromic number reads the same both ways. The largest palindrome made
// from the product of two 2-digit numbers is 9009 = 91 99.

// Find the largest palindrome made from the product of two 3-digit numbers.
package com.ryanponeill.euler

object Problem04 {
  import Euler._

  def main(args: Array[String]) {
    println(go(2))
    println(go(3))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = {
    val output = "Largest Palindrome Product of %d-Digit Numbers: "
    getOutput(output, maxPalindromeProduct)(n)
  }

  def maxPalindromeProduct(n: Long): Long =
    nDigitNums(n).flatMap(x => nDigitNums(n).map(_ * x).filter(isPalindrome)).max

}

