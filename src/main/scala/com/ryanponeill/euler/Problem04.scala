// http://projecteuler.net/problem=4

// A palindromic number reads the same both ways. The largest palindrome made
// from the product of two 2-digit numbers is 9009 = 91 99.

// Find the largest palindrome made from the product of two 3-digit numbers.
package com.ryanponeill.euler

object Problem04 {
  def main(args: Array[String]) {
    println("Largest Palindrome Product of 2-Digit Numbers: " + maxPalindromeProduct(2))
    println("Largest Palindrome Product of 3-Digit Numbers: " + maxPalindromeProduct(3))
  }

  def isPalindrome(n: Int): Boolean = {
    val strValue = n.toString
    strValue == strValue.reverse
  }

  def numsFrom(n: Int): Stream[Int] =
    n #:: numsFrom(n+1)

  def numsFromTo(m: Int, n: Int): Stream[Int] =
    numsFrom(m).takeWhile(_ <= n)

  def maxPalindromeProductFromTo(m: Int, n: Int): Int =
    numsFromTo(m,n).flatMap(x => numsFromTo(m,n).map(_ * x).filter(isPalindrome)).max

  def maxPalindromeProduct(digits: Int): Int = {
    val lower = math.pow(10,digits-1).toInt
    val upper = math.pow(10,digits).toInt - 1
    maxPalindromeProductFromTo(lower,upper)
  }

}

