// http://projecteuler.net/problem=3

//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?
package com.ryanponeill.euler

object Problem03 {
  def main(args: Array[String]) {
    //val number = 13195
    val number = 600851475143L
    println(maxPrimeFactorOf(number))
  }

  def numsFrom(n: Long): Stream[Long] =
    n #:: numsFrom(n+1)

  def isPrime(n: Long): Boolean =
    numsFrom(2).takeWhile(x => x * x < n).forall(x => n % x != 0)

  def factorsOf(n: Long): Stream[Long] =
    numsFrom(2).takeWhile(x => x * x < n).filter(x => n % x == 0)

  def primeFactorsOf(n: Long): Stream[Long] =
    factorsOf(n).filter(isPrime)

  def maxPrimeFactorOf(n: Long): Long =
    primeFactorsOf(n).max

}
