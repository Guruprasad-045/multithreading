package multithreading.com;

import java.util.Scanner;

class Demo1 extends Thread  {
	 public void run() {
		 System.out.println("addition task starting ");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number");
			int a=s.nextInt();
			System.out.println("Enter second number");
			int b=s.nextInt();
			int c=a+b;
			System.out.println(c);
			System.out.println("completed");
}
	 }
   class Demo2 extends Thread{
	   public void run() {

			System.out.println("character starting");
			for(int i=65;i<=75;i++) {
				System.out.println((char)i);
				try {
					
					Thread.sleep(1000);
					}
					
				catch (Exception e) {
					
			e.printStackTrace();
				}

				
			}
			System.out.println("completed");
			
	}
   }
class Demo3 extends Thread{
	public void run() {
		System.out.println("number starting");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
		catch (Exception e) {
		 e.printStackTrace();
		}
		}
		System.out.println("completed");
		}
	}
public class Demo {
	 public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		d1.start();
		d2.start();
		d3.start();
		
	}
	
}


		
		
	
