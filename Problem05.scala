// http://projecteuler.net/problem=5

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

object Problem05 {
  def main(args: Array[String]) {
    println("Lowest Common Multiple of 1 to 10: " + lcmOfUpTo(10))
    println("Lowest Common Multiple of 1 to 20: " + lcmOfUpTo(20))
  }

  def numsFrom(n: Int): Stream[Int] =
    n #:: numsFrom(n+1)

  def numsFromTo(m: Int, n: Int): Stream[Int] =
    numsFrom(m).takeWhile(_ <= n)

  def lcmOfUpTo(n: Int): Int =
    numsFromTo(1,n).fold(1)(lcm)

  def lcm(a: Int, b: Int): Int = 
    ((a.toLong * b.toLong) / gcd(a, b)).toInt

  def gcd(a: Int, b: Int): Int = 
    if (a == b) a else if (a > b) gcd(a - b, a) else gcd(a, b - a)
}
