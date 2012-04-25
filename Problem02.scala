// http://projecteuler.net/problem=2

// Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
// By starting with 1 and 2, the first 10 terms will be:

// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

// By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
// find the sum of the even-valued terms.

// Normal Fibonacci Recurrence
// F0 = 0
// F1 = 1
// Fi = Fi-1 + Fi-2

// In the CLRS Algorithms book (page 59), the answer to the recurrence relation is shown as 
// [Golden Ratio] = (1 + square root 5) / 2
// [Conjugate] = (1 - square root 5) / 2
// Fi = ([Golden Ratio]^i - [Conjugate]^i) / (square root 5)

// This problem starts with 1,2 instead of 1,1 so terms are off by 1

object Problem02 {
  def main(args: Array[String]) {
    val limit = 4000000
    println(evenValuedFibonacciSum(limit))
  }

  def evenValuedFibonacciSum(upperBound: Int) = 
    fibStream(1).takeWhile(_ <= upperBound).filter(_ % 2 == 0).sum

  def fibStream(i: Int): Stream[Int] =
    fibonacci(i) #:: fibStream(i + 1)

  def fibonacci(i: Int) = {
    val termIndex = i + 1

    val root5 = math.sqrt(5)
    val golden = (1 + root5) / 2
    val conjugate = (1 - root5) / 2

    ((math.pow(golden, termIndex) - math.pow(conjugate, termIndex)) / root5).toInt
  }
}