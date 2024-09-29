package ThirdDay;

public class more_conditions {

	public static void main(String[] args) {

		int a=700;
		int b=70;
				if (a>=b) {
					System.out.println("condition is true");
				} else {
					System.out.println("condition is false");
				}
				if (a==b) {
					System.out.println("condition is true");
				} else {
					System.out.println("condition is false");
				}

				int average=90;
				if (average<=100 && average>=90) {
					System.out.println("Grade:A");
				}else if (average<=89 && average>=80){
					System.out.println("Grade:B");
				}else if (average <=79 && average>=70){
					System.out.println("Grade:C");
				}else if (average <=69 && average>=60){
					System.out.println("Grade:D");
				}else {
					System.out.println("Try again!");
				}
		/*		boolean Mana=false;
				if (Mana = null ) {
					System.out.println("Mana can play minecraft");
				}else {
					System.out.println("Mana cannot play minecraft");
				}
		*/	

				int i=7000;
				int j=700;
				int k=70000;
				if (i>k) {
					if (i>j) {
						System.out.println(i+" = i is the greatest");
					}else {
						System.out.println(j+" = j is the greatest");
					}
				}else if (k>j) {
					System.out.println(k+" = k is the greatest");
				}else {
					System.out.println(j+" = j is the greatest");
				}		
			
	}

}
