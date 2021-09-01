object read
{
	def main(args: Array[String])
	{
		var input: String = " "

		print("Do you now know how to take input from user(through keyboard)-: ")

		input = scala.io.StdIn.readLine()

		println("Your response is: " + input)
	}
}