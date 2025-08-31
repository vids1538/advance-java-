import java.util.Scanner;

public class SumAllOddNum {
    public static void main(String[] args) {
        System.out.println("sum of all odd number till N");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        int sum=0;
        System.out.print("the numbers are :");
        for (int i=0;i<=num;i++)
        {
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println("Sum= "+sum);
    }
}
