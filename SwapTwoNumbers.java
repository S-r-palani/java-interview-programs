import java.util.Scanner;
class SwapTwoNumbers{
	public static void main(String[] args){
		System.out.println("Swap two numbers with using temp variable");
		int num1,num2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of first number ");
		num1=sc.nextInt();
		System.out.print("enter the value of second number ");
		num2=sc.nextInt();
		System.out.println("before swapping the value of num1 "+ num1 +" num2 is "+ num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping the value of num1 "+ num1 +" num2 is "+ num2);	
		
		
	}
}