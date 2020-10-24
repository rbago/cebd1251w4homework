
object Exercise4 {
	def fib( n: Int ) = {
	
		var a = 0
		var b = 1
		var c = 0
		
		if (n >= 0){
			println(a)
		}
		if (n >= 1){
			println(b)
		}
		for(i <- 1 to n) {
      c = a + b
      println(c)
      a = b
      b = c
    }

  }                                               //> fib: (n: Int)Unit
  
  fib(10)                                         //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
                                                  //| 89
}