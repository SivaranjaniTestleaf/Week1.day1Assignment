package week1.day1;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =5;
		int fact = 1;
		for (int j = 1; j <= i; j++) 
		{
			fact = fact*j;
		}

		System.out.println("Factorial for "+ i +" is :"+fact);
	}

}
