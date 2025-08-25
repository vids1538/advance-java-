import java.util.Scanner;
public class AreaOfTraingle {
    public static void main(String[] args) {
        System.out.println("CALCULATE AREA OF A TRIANGLE ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base  of traingle :");
        double base=sc.nextInt();
        System.out.println("enter height of triangle :");
        double height=sc.nextInt();

       double area=0.5*base*height;

       // System.out.println("perimetr of rectangle is "+perimeter+"metre");
        System.out.println("area of triangle is "+area +"metre square");

    }
}
