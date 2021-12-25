import java.util.Scanner;
class EvenOrOddNumber{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to be reverse ");
		int num=sc.nextInt();
		boolean b=true;
		if(num%2==0){
			System.out.println("the given number is an even number");
			
		} else{
			System.out.println("the given number is an odd number");
		}
		



	}
}