import scala.math.pow
class Power
{
	var Square : Double=1
	var Cube : Double=1
	var fourth_Pow: Double=1
	def cal_Power(arg:Int)
	{
		var i = 1
		var res = 1
		while(i < 5)
		{
			res = res*arg
			if(i == 2 || i == 3 || i == 4)
			{
				Display(res,i,arg)
			}
			i = i + 1
		}
	}
	def Display( res:Int, i:Int, arg:Int)
	{
		println( arg + " to the power " + i + " is: " + res)
	}
	def lib_Method(arg:Int)
	{
		Square = scala.math.pow(arg,2)
		Cube = scala.math.pow(arg,3)
		fourth_Pow = scala.math.pow(arg,4)
        print("\n - * - * - * - * - * - * - * - * - * - *-\n")
		println("Using library function:- ")
		println("Square of " + arg + " is: " + Square)
		println("Cube of " + arg + " is: " + Cube)
		println("Fourth power of " + arg + " is: " + fourth_Pow)
	}
}
object Powerfinding
{
	def main(args: Array[String])
	{
		var input :Int=0
		print("Enter anumber: ")
		input = scala.io.StdIn.readInt()

		val obj = new Power()
		obj.cal_Power(input)
		obj.lib_Method(input)
	}
}