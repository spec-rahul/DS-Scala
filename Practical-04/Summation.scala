class ADD
{
	var sum: Int = 0

	def add(num_1:Int, num_2:Int)  // method to add mutables and immutables
	{
		sum = num_1 + num_2   
	}
    
	def Display_Result() // method to print result
	{
		println("Sum is: " + sum)
	}
}
object Summation
{
	def main(args: Array[String])
	{
        // mutable
		var x: Int = 10  
		var y: Int = 20

        // immutable
		val a: Int = 5  
		val b: Int = 10

		val obj1, obj2, obj3 = new ADD() // object creation

		obj1.add(x,y)
		print("When variable type is Mutable (x=10, y=20) -> ")
		obj1.Display_Result()

		obj2.add(a,b)
		print("When variable type is Immutable (a=5, b=10) -> ")
		obj2.Display_Result()

		obj3.add(x,b)
		print("When one is var and one is val (x=10, b=10)-> ")
		obj3.Display_Result()
	}
}