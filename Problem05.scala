// http://projecteuler.net/problem=5

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

object Problem05 {
  def main(args: Array[String]) {
    val numbersToTen = (1 to 10).toList
    println("Lowest Common Multiple of 1 to 10: " + lcmList(numbersToTen))

    val numbersToTwenty = (1 to 20).toList
    println("Lowest Common Multiple of 1 to 20: " + lcmList(numbersToTwenty))
  }

  def lcmList(numbers: List[Int]) = 
    numbers.foldLeft(1)(lcm)

  def lcm(a: Int, b: Int) = 
    ((a.toLong * b.toLong) / gcd(a, b)).toInt

  def gcd(a: Int, b: Int) : Int = 
    if (a == b) a else if (a > b) gcd(a - b, a) else gcd(a, b - a)
}