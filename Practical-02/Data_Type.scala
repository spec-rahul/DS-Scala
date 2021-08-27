object Data_Types
{
	var byte_var: Byte = 127	//Range from -128 to 127
	var short_var: Short = 32767	//Range -32768 to 32767
	var integer_var: Int = -2147483648	//Range -2147483648 to 2147483647
	var long_var: Long = 999999999	//Range - 2^63 to 2^63-1

	var float_var: Float = 121.234f	//Range 1.40129846432481707e-45 to 3.40282346638528860e+38
	var double_var: Double = 65654.4545564	//Range 4.94065645841246544e-324d to 1.79769313486231570e+308d

	var character_var: Char = 'R'
	var string_var: String = "Scala Practical"

	var bool_var: Boolean = true	//true or false

	val null_RefVariable: String = null
	val Null_Datatype: Null = null

	def myException(e: Exception):Nothing=
	{
		println("Exception: %s".format(e.getMessage))
		throw new Exception("New Exception occured")
	}
	
	def anyRef(x: AnyRef) = println("AnyRef Data_type: " + x)
	def any(y: Any) = println("Any Data_type: " + y)

	def Display(): Unit=
	{
		println("Byte Data_type: " + byte_var)
		println("Short Data_type: " + short_var)
		println("Int Data_type: " + integer_var)
		println("Long Data_type: " + long_var)
		println("Float Data_type: " + float_var)
		println("Double Data_type: " + double_var)
		println("Char Data_type: " + character_var)
		println("String Data_type: " + string_var)
		println("Boolean Data_type: " + bool_var)
	}

	def main(args: Array[String])
	{
		Display();
		anyRef(Null_Datatype)
		any(Null_Datatype)
	}
}


