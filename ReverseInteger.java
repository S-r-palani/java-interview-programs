import java.util.Scanner;
class ReverseInteger{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to be reverse ");
		int num=sc.nextInt();
		int reverse=0;
		int sum=0;
		
		System.out.println("the number before reverse is "+num);
		while(num>0){
			int remainder=(num)%10;
			sum=(sum*10)+remainder;
			num=num/10;	
		}
		System.out.println("the number after reverse is "+sum);





	}
}