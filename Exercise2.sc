object Exercise2 {
  
	def fact(x: Int) : Int = {
 		(1 to x).reduce((x: Int, y: Int) => x * y)
	}                                         //> fact: (x: Int)Int
	val y = 6                                 //> y  : Int = 6
  
	if ((y % 1) == 0) {
		println("The factorial is: " + fact(y))
	} else{
		println("Not an integer")
	}                                         //> The factorial is: 720

}