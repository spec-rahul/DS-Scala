class find_Prime
{
	def check_Prime(arg:Int):Boolean=
	{
		var i = 2
		while(i < arg/2)
		{
			if(arg%i == 0)
			{
				return false
			}
			i =i + 1
		}
		return true
	}
}
object Prime
{
	def main(args: Array[String])
	{
		var input:Int = 0
		var result:Boolean = true
		print("Enter anumber: ")
		input = scala.io.StdIn.readInt()

		val obj = new find_Prime()
		result = obj.check_Prime( input )
		if(result == true)
		{
			println( input + " is a prime number")
		}
		else
		{
			println( input + " is not a prime number")
		}
	}
}