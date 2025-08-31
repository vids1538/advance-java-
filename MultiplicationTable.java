import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("MULTIPLICATION TABLE");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*num);
        }
    }
}
