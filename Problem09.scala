// http://projecteuler.net/problem=9

// A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

// a^2 + b^2 = c^2
// For example, 32 + 42 = 9 + 16 = 25 = 52.

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

object Problem09 {
	def main(args: Array[String]) {
		val answerList = 
		    for {
		    	a <- (1 to 333).toList
		    	b <- (a to 500).toList
		    	c <- (b to 1000).toList
		    	d = (a, b, c) if (a + b + c == 1000)
		    	e = (a * b * c) if ((a * a) + (b * b) == (c * c))
		    } yield e
		println("Pythagorean triplet product: " + answerList.head)
	}
}