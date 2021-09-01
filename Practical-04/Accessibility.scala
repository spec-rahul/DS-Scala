/*
	Write a program which would demonstrate the use of Access Modifiers 
	( Private, Public, Protected )
*/

class Parent
{
    // pvt is private variable
	private var pvt: Int = 1   
	println("Private variable (initial): " + pvt)

    // pub is public variable
    var pub:Int = 2     
	println("Public variable (initial) : " + pub)

    // prot is protected variable
	protected var prot: Int = 3   
	println("Protected variable (initial) : " + prot)


	def Display_Parent()
	{
		pvt = 10
		println("Private variable is accessible Here (Parent) : " + pvt)

		pub = 20
		println("Public variable is accessible Here (Parent) : " + pub)
		
		prot = 30
		println("Protected variable is accessible Here (Parent) : " + prot)
	
	}
}

class Subclass extends Parent
{
	def Display_Subclass()
	{
		// private variable not accessible in subclass
		println("Private variable is not accessible Here (Subclass) " )

		pub = 200
		println("Public variable is accessible Here (Subclass) : " + pub)

		prot = 300
		println("Protected variable is accessible Here (Subclass) : " + prot)

	}
}
object Accessibility
{
	def main(args: Array[String])
	{
		print("\n---->>\n");
		var Obj_Parent=new Parent()
		Obj_Parent.Display_Parent()

		print("\n---->>\n");
		var Obj_Subclass=new Subclass()
		Obj_Subclass.Display_Subclass()
	}
}