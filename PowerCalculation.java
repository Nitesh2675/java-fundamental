import java.util.Scanner;

class PowerCalculation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter base:");
int base=sc.nextInt();

System.out.print("Enter exponent:");
int exponent=sc.nextInt();

System.out.print("Result : "+ Math.pow(base,exponent));
  }
}