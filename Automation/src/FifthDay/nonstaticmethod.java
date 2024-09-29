package FifthDay;

public class nonstaticmethod {

	public static void main(String[] args) {
	
		nonstaticmethod ob = new nonstaticmethod();
		ob.Profit();
		ob.ProfitsOfCompany(345467, 45467, "May");
		ob.ProfitOfCompany(76878, 56488, "June");
		
		int width = 10, height = 30;
		cr(width, height); 
		//String Fname = "Mana";
		//String Lname = "Ham1d";
		//FullName(Fname, Lname);
		FullName("Mana","Ham1d");
		// ob.sqparameter(3, 3); 
		int value = sqparameter(7,7);
		System.out.println(value);
		parameter();
	}

	 public void Profit() {
	 int Revenue=600000;
	 int Expenses=60000;
	 int Profit=Revenue-Expenses;
	 System.out.println("The profit of the company is "+Profit);
	 //System.out.println(Profit);  
 }

	public void ProfitsOfCompany(int revenues, int expense, String Month) {
		 int profits=revenues-expense;
		 System.out.println("The profit of "+ Month +" is "+profits); 
	 }	
	
	public int ProfitOfCompany(int revenue, int expenses, String Month) {
		 int profit=revenue-expenses;
		 System.out.println("The profit of "+ Month +" is "+profit);
		 return profit;
	}
	
	public nonstaticmethod() {
		System.out.println("This is using the constructor for objects");
	}

	public static void cr(int width, int height)
	{
		int area = width * height;
		System.out.println(area);
	}
	
	public static void FullName(String Fname, String Lname)
	{
		
		System.out.println(Fname +" "+ Lname);
	}
	
	public static int sqparameter (int length, int width)
	{ 	int sqparameter = length + width + length + width;
		System.out.println(sqparameter);
		return sqparameter;		
	}
	
	public static void parameter()
	{
		int length = 3;
		int width = 3;
		int parameter = length + width + length + width;
		System.out.println(parameter);
	}
		
}

