import java.util.Scanner;

public class VolumeOfCylinder{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);

System.out.print("Enter the radius of the cylinder: ");
double radius=sc.nextDouble();

System.out.print("Enter the height of the cylinder: ");
double height=sc.nextDouble();

double volume=Math.PI * height *Math.pow(radius,2);

System.out.printf("The volume of cylinder is %.2f",volume);


}

}
