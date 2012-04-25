// http://projecteuler.net/problem=3

//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?

object Problem03 {
	def main(args: Array[String]) {
		//val number = 13195
		val number = 600851475143L
		println(maxPrimeFactor(number))
	}

	def maxPrimeFactor(value: Long) = 
		value match {
			case _ if (value < 2) => throw new IllegalArgumentException
			case _ => factors(value).sortWith(_ > _).filter(isPrime).max
		}

	def isPrime(value: Long) : Boolean =
		if (value == 2) true else primeTest(value, math.sqrt(value).toLong)

	def primeTest(value: Long, attempt: Long): Boolean = 
		attempt match {
			case 1 => true
			case _ if (value % attempt == 0) => false
			case _ => primeTest(value, attempt - 1)
		}

	def factors(value: Long): List[Long] = {
		val factorLimit = math.max(math.sqrt(value).toInt, 2)
		val smallFactors = (2 to factorLimit).toList.filter(value % _ == 0).map(_.toLong)
		val largeFactors = smallFactors.map(value / _)
		smallFactors ::: largeFactors
	}
}