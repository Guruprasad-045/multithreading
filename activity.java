package multithreading.com;
import java.util.Scanner;

public class activity {
	public static void main(String[] args) throws Exception {
		System.out.println("addition task starting ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("completed");
		
		System.out.println("character starting");
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			Thread.sleep(1000);
		}
		System.out.println("completed");
		
		System.out.println("number starting");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("completed");
		
		
	}

}
