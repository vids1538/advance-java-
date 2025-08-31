import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("to calculate sum of digits");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();
        int Sumis = Sumof(num);
        System.out.println("Sum is:"+Sumis);

    }
         static int Sumof(int num)
        {
            int sum=0;
            while(num>0)
            {
                sum=sum + (num%10);
                num=num/10;
            }
            return sum;
        }
    }

