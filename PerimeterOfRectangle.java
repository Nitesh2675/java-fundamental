import java.util.Scanner;

class PerimeterOfRectangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("enter length:");
int length=sc.nextInt();
System.out.print("enter width:");
int width=sc.nextInt();

System.out.println("Perimeter of rectangle: " + (2 * (length + width)));




   }
}