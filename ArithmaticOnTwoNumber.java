import java.util.Scanner;
public class ArithmaticOnTwoNumber {
    public static void main(String[] args) {
        System.out.println("enter first number :");
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        System.out.print("enter second number :");
        int second =sc.nextInt();
        int addition=first+second;
        int subtraction=first-second;
        int mul=first*second;
        int divide=first/second;
        int remainder=first%second;
        System.out.println("addition is "+addition);
        System.out.println("subtraction is "+subtraction);
        System.out.println("mul is "+mul);
        System.out.println("divide is "+divide);
        System.out.println("remainder is "+remainder);
    }
}
