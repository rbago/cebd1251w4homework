object Exercise3 {
  def factorialDouble( n: Double ) : Int = {
    
    var f = 1
    val j = n.round.toInt
    
    for(i <- 1 to j) {
      f = f * i
    }
    f
  }                                               //> factorialDouble: (n: Double)Int

  val x = 4.8                                     //> x  : Double = 4.8
  
  val xFactorial = factorialDouble(x)             //> xFactorial  : Int = 120
  
  println(f"The factorial of $x is: $xFactorial") //> The factorial of 4.8 is: 120
}