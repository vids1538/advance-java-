import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("....two number addition program....");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int a=sc.nextInt();
        System.out.print("\nenter second number:");
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("addition of a and b is "+add);

    }
}
