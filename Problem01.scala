// http://projecteuler.net/problem=1

// If we list all the natural numbers below 10 that are multiples of 3 or 5, 
// we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.

object Problem01 {
  def main(args: Array[String]) {
    val output = "Sum of [3,5] multiples below %d: "

    val verify = multipleSum(10)
    println(output.format(10) + verify)

    val answer = multipleSum(1000)
    println(output.format(1000) + answer)
  }

  def numsFrom(start: Int): Stream[Int] =
    start #:: numsFrom(start+1)

  def multipleSum(upperLimit: Int): Int = 
    numsFrom(1).takeWhile(_ < upperLimit).filter(x => (x % 3 == 0) || (x % 5 == 0)).sum
}
