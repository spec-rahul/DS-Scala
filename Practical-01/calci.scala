class Arithmetic()
{
	// variable declaration and initialisation

	var Sum : Int = 0
	var Diff : Int = 0
	var Prod : Int = 0
	var Quot : Float = 0
	var Rem : Int = 0


	def calculate(a : Int , b : Int) // method for performing Calculations
	{
		println("-->The value of a :- "+ a +"\n-->The value of b :- "+ b +"\n")

		Sum = a + b        // will perform addition operation
		Diff = a - b        // will perform substraction operation 
		Prod = a * b        // will perform multiplication operation 
		Quot = a / b       // will perform division operation
		Rem = a % b       // will perform modulus operation
	}

	def result() // function to display result
	{
		println("a + b = " + Sum ) 
		println("a - b = " + Diff )
		println("a * b = " + Prod )
		println("a / b = " + Quot )
		println("a % b = " + Rem )
		print("\n")
	}
}
object calci
{
	def main( args: Array[String])
	{
		// objects of class Arithmetic
		
		var obj1 = new Arithmetic()

                 var obj2 = new Arithmetic()

 		val obj3 = new Arithmetic()

		
		// Calling functions with help of object and passing values as arguments

		obj1.calculate(6,2)
		obj1.result()

		obj2.calculate(53,5)
		obj2.result()
		
		obj3.calculate(11,16)
		obj3.result()
	}
}