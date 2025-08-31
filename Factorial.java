import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("  factorial  ");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        for(int j=1;j<=num;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("the factorial is :"+fact);
    }
}
