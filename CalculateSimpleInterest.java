import java.util.Scanner;

class CalculateSimpleInterest{
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter principal:");
	int principal=sc.nextInt();
	
	System.out.print("Enter rate:");
	int rate=sc.nextInt();
	
	System.out.print("Enter time:");
	int time=sc.nextInt();
	
	System.out.print("Simple Interest is : "+(principal*rate*time)/100);
	
}	
	
}
