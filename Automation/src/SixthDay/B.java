package SixthDay;

public class B extends A {

	public static void main(String[] args) {
/*
A obj = new A ();
obj.PublicAccessModifier();
obj.ProtectedAccessModifier();
obj.DefaultAccessModifier();
*/

B object = new B ();
object.PublicAccessModifiers();
object.ProtectedAccessModifiers();
object.DefaultAccessModifiers();
object.PublicAccessModifier();
object.PrivateAccessModifier();
object.ProtectedAccessModifier();
object.DefaultAccessModifier();
	}
	
	public void PublicAccessModifier () {
		System.out.println("This is a public access modifier - B");
		PrivateAccessModifier();
	}
	
	private void PrivateAccessModifier () {
		System.out.println("This is private access modifier - B");
	}

	protected void ProtectedAccessModifier () {
		System.out.println("This is protected access modifier - B");
		PrivateAccessModifier();
	}
	
	void DefaultAccessModifier () {
		System.out.println("This is a default access modifier - B");
		PrivateAccessModifier();
	}
		
}
