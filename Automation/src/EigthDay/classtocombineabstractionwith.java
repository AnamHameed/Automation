package EigthDay;

public class classtocombineabstractionwith implements Abstraction,AnotherInterface{

	public static void main(String[] args) {
		classtocombineabstractionwith ob = new classtocombineabstractionwith ();
		ob.addition();
	}
	
	public void addition() {
		int a=77;
		int b=70;
		int c=a+b;
		System.out.println(c);
	}
		
}
