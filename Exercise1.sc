object Exercise1 {
  
    val x : Double = 42.354562                    //> x  : Double#1210 = 42.354562
    val y : Int = 3                               //> y  : Int#913 = 3
    
    val xRound = BigDecimal(x).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
                                                  //> xRound  : Double#1210 = 42.35
            
    println("The round value of " + x + " is " + xRound)
                                                  //> The round value of 42.354562 is 42.35
    println(f"The left zero padding version of $y is $y%04d")
                                                  //> The left zero padding version of 3 is 0003
}