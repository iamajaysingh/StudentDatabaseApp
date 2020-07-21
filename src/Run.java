import java.util.Scanner;

import Model.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many student you want to add. please enter here.");
		Scanner s = new Scanner(System.in);
	         int  studentCount =  s.nextInt();
	         Student[] stuArray = new Student[studentCount];
	         
	         for(int i =0 ; i < stuArray.length;  i++) {
	        	 stuArray[i]     =  new Student();
	         }
	         System.out.println("Please enter info of next student.");
	         

	}

}
