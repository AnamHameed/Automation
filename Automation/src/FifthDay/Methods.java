package FifthDay;

public class Methods {

	public static void main(String[] args) {
				Profit();
		//ProfitOfCompany(30000, 300, "January");
		//ProfitOfCompany(600000, 79789, "February");
		//ProfitOfCompany(47893, 34879, "March");
		int Outcome=ProfitOfCompany(34493, 3430, "April");
		System.out.println(Outcome);
		
		String Ihope = "I hope this presentation was helpful";
		int length = Ihope.length();
		String AllUpperCase = Ihope.toUpperCase();
		System.out.println("As Is: " + Ihope);
		System.out.println("Total Characters: " + length);
		System.out.println("All Capital: " + AllUpperCase);
	}

	public static void Profit() {
	 int Revenue=600000;
	 int Expenses=60000;
	 int Profit=Revenue-Expenses;
	 System.out.println("The profit of the company is "+Profit);
	 //System.out.println(Profit);  
 }
	
/*
	public static void ProfitOfCompany(int revenue, int expenses, String Month) {
		int profit=revenue-expenses;
		System.out.println("The profit of "+ Month +" is "+profit);  
	 }		
*/
	public static int ProfitOfCompany(int revenue, int expenses, String Month) {
		 int profit=revenue-expenses;
		 System.out.println("The profit of "+ Month +" is "+profit);
		 return profit;
	}
}
