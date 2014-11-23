// http://projecteuler.net/problem=9

// A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

// a^2 + b^2 = c^2
// For example, 32 + 42 = 9 + 16 = 25 = 52.

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.
package com.ryanponeill.euler

object Problem09 {
  import Euler._

  val answer = "Pythagorean triplet product for %d: %d"
  val noAnswer = "No answer for %d"

  def main(args: Array[String]) {
    println(go(1000))
  }

  def apply(n: Long): String = go(n)

  def go(n: Long): String = { 
    pythagoreanTriple(n).map(answer.format(n,_)).getOrElse(noAnswer.format(n))
  }

  def pythagoreanTriple(n: Long): Option[Long] =
    numsFromTo(1,third(n)).flatMap(a =>
      numsFromTo(a,half(n)).flatMap(b =>
        numsFromTo(b,n).filter(isN(n,a,b)).filter(isSumOfSquares(a,b)).map(a * b * _)
      )
    ).headOption

  def isSumOfSquares(a: Long, b: Long): Long => Boolean =
    (c: Long) => square(a) + square(b) == square(c)

  def isN(n: Long, a: Long, b: Long): Long => Boolean =
    (c: Long) => a + b + c == n

  def third(n: Long): Long = n / 3

  def half(n: Long): Long = n / 2
}
