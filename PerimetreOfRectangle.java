import java.util.Scanner;
public class PerimetreOfRectangle {
    public static void main(String[] args) {
        System.out.println("CALCULATE PERIMETRE OF A RECTANGLE ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of rectangle:");
        int length=sc.nextInt();
        System.out.println("enter breadth of rectangle:");
        int breadth=sc.nextInt();

        int perimeter=2*(length+breadth);
        int area=length*breadth;

        System.out.println("perimetre of rectangle is "+perimeter+"metre");
        System.out.println("area of rectangle is "+area +"metre square");

    }
}
