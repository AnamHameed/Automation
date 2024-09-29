package FourthDay;

public class Arrays {

	public static void main(String[] args) {
	
 		int [] student = new int [10];
		student [0] = 7;
		student [1] = 6;
		student [2] = 5;
		student [3] = 4;
		student [4] = 3;
		student [5] = 2;
		student [6] = 1;
		student [7] = 8;
		student [8] = 9;
		student [9] = 10; 
		System.out.println(student[1]);
	 
	 	for (int i=0; i<=2; i++) {
			System.out.println("student["+i+"] = "+student[i]);
		}
		
		int [] teachers = new int [10];
		teachers [1] = 1;
		for (int i=0; i<=9; i++) {
			System.out.println("teachers["+i+"] = "+teachers[i]);
		}
		System.out.println("Length of the index is = "+teachers.length);

		int [] students = new int [10];
		students [1]=1;
		for (int k:students) {
					System.out.println(k);
				}	
		
		int [][] studentss = new int [3][7];
		studentss[0][2]=60;
		System.out.println(studentss[0][2]);
	}

}
