import java.util.Scanner;

class AverageOfThreeNumber{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

System.out.print("Enter first number:");
int first = sc.nextInt();

System.out.print("Enter second number:");
int second =sc.nextInt();

System.out.print("Enter third number:");
int third=sc.nextInt();

System.out.print("Average of three numbers: "+(first+second+third)/3);

    }
}