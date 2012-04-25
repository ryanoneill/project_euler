// http://projecteuler.net/problem=6

// The sum of the squares of the first ten natural numbers is,

// 1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,

// (1 + 2 + ... + 10)^2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

object Problem06 {
  def main(args: Array[String]) {
    val numbersToTen = (1 to 10).toList
    println("Difference of Squares of 1 to 10: " + differenceSquares(numbersToTen))

    val numbersToHundred = (1 to 100).toList
    println("Difference of Squares of 1 to 100: " + differenceSquares(numbersToHundred))
  }

  def differenceSquares(numbers: List[Int]) =
    squareOfSums(numbers) - sumOfSquares(numbers)

  def sumOfSquares(numbers: List[Int]): Int = 
    numbers.map(x => x * x).sum

  def squareOfSums(numbers: List[Int]): Int = {
    val sum = numbers.sum
    sum * sum
  }
}