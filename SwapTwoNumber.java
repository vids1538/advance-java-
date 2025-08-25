import java.util.Scanner;
public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("........swap two number....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        int first=sc.nextInt();
        System.out.println("enter second number :");
        int second=sc.nextInt();
        System.out.println("first:"+first);
        System.out.println("second :"+second);
        int temp=first;
        first=second;
        second=temp;
        System.out.println("after swapping ");
        System.out.println("first:"+first);
        System.out.println("second:"+second);

        //without using temp variable
        System.out.println("without using temp variable");
        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println("first:"+first);
        System.out.println("second:"+second);

    }
}
