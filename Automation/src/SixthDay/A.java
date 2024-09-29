package SixthDay;

public class A {

	public static void main(String[] args) {

A obj = new A ();
obj.PublicAccessModifiers();
obj.PrivateAccessModifiers();
obj.ProtectedAccessModifiers();
obj.DefaultAccessModifiers();
	}
	
		public void PublicAccessModifiers () {
			System.out.println("This is public access modifiers - A");
			PrivateAccessModifiers();
		}
		
		private void PrivateAccessModifiers () {
			System.out.println("This is private access modifiers - A");
		}

		protected void ProtectedAccessModifiers () {
			System.out.println("This is protected access modifiers - A");
			PrivateAccessModifiers();
		}
		
		void DefaultAccessModifiers () {
			System.out.println("This is a default access modifiers - A");
			PrivateAccessModifiers();
		}
		
}
