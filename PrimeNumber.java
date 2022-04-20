package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		// To find a number is prime number
		int num = 13;
		boolean bool = false;
		for(int i=2; i<=num/2;i++) {
			if (num%i==0)
			{
				bool=true;
				break;
			}
	}
			if(!bool)
				System.out.println("its a prime number");
			else
				System.out.println("Its not a prime number");
		
	}

}
