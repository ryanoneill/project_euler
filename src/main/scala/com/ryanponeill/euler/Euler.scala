package com.ryanponeill.euler

object Euler {
  def not(b: Boolean): Boolean =
    !b

  def isEven(n: Long): Boolean =
    n % 2 == 0

  def square(n: Long): Long =
    n * n

  def isFactorOf(m: Long): Long => Boolean =
    (n: Long) => m % n == 0

  def isNotFactorOf(m: Long): Long => Boolean =
    (n: Long) => not(isFactorOf(m)(n))

  def squareLte(m: Long): Long => Boolean =
    (n: Long) => square(n) <= m

  def numsFrom(n: Long): Stream[Long] =
    n #:: numsFrom(n+1)

  def fibsFrom(m: Long, n: Long): Stream[Long] =
    m #:: fibsFrom(n, m+n)

  def until(ns: Stream[Long], n: Long): Stream[Long] =
    ns.takeWhile(_ < n)

  def to(ns: Stream[Long], n: Long): Stream[Long] =
    ns.takeWhile(_ <= n)

  def even(ns: Stream[Long]): Stream[Long] =
    ns.filter(isEven)

  def numsFromUntil(m: Long, n: Long): Stream[Long] =
    until(numsFrom(m),n)

  def numsFromTo(m: Long, n: Long): Stream[Long] =
    to(numsFrom(m),n)

  def isPrime(n: Long): Boolean =
    numsFrom(2).takeWhile(squareLte(n)).forall(isNotFactorOf(n))

  def factorsOf(n: Long): Stream[Long] = {
    val small = numsFrom(1).takeWhile(squareLte(n)).filter(isFactorOf(n))
    val large = small.map(n / _)
    val all = small append large
    all
  }

  def isMultipleOf(ns: List[Long])(n: Long): Boolean =
    ns.exists(n % _ == 0)

  def getOutput(s: String, f: Long => Long)(n: Long): String =
    s.format(n) + f(n).toString

}
