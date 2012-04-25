// http://projecteuler.net/problem=10

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

// Find the sum of all the primes below two million.

object Problem10 {
	def main(args: Array[String]) {
		val numbersToTen = (2 to 10).toList
		println("Sum of primes below 10: " + sumPrimes(0, numbersToTen))

		val numbersTo1000 = (2 to 1000).toList
		println("Sum of primes below 1000: " + sumPrimes(0, numbersTo1000))

		val numbersTo10000 = (2 to 10000).toList
		println("Sum of primes below 10000: " + sumPrimes(0, numbersTo10000))

		val numbersTo100000 = (2 to 100000).toList
		println("Sum of primes below 100000: " + sumPrimes(0, numbersTo100000))

		val numbersToTwoMillion = (2 to 2000000).toList
		println("Sum of primes below 2,000,000: " + sumPrimes(0, numbersToTwoMillion))
	}

	def sumPrimes(sum: Long, numbers: List[Int]): Long = {
		numbers match {
			case x :: xs => sumPrimes(sum + x, xs.filter(y => y % x != 0))
			case _       => sum			
		}
	}
}