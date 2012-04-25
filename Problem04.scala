// http://projecteuler.net/problem=4

// A palindromic number reads the same both ways. The largest palindrome made
// from the product of two 2-digit numbers is 9009 = 91 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

object Problem04 {
  def main(args: Array[String]) {
    val twoDigitNumbers = (10 to 99).toList
    println("Largest Palindrome Product of 2-Digit Numbers: " + maxPalindromeProduct(twoDigitNumbers))

    val threeDigitNumbers = (100 to 999).toList
    println("Largest Palindrome Product of 3-Digit Numbers: " + maxPalindromeProduct(threeDigitNumbers))
  }

  def maxPalindromeProduct(numbers: List[Int]) = {
    val palindromes = 
      for {
      	a <- numbers
      	b <- numbers
      	value = a * b
      	if (value.toString == value.toString.reverse)
      } yield value
      palindromes.max
  }
}

