package week1.day1;

public class Fibonacci {

	// To find Fibonacci Series for a given range
	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		for(int i=1; i<8; i++)
		{
			int sum = firstNum+secNum;
			firstNum= secNum;
			secNum = sum;
			System.out.println(firstNum);
 
			}		
}
}