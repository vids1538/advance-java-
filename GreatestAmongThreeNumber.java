import java.util.Scanner;
public class GreatestAmongThreeNumber {
    public static void main(String[] args) {
        System.out.println("greatest among three number program.");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int firstNum=sc.nextInt();
        System.out.print("\nenter second number :");
        int secondNum=sc.nextInt();
        System.out.print("\nenter third number:");
        int thirdNum=sc.nextInt();
        if(firstNum==secondNum &&secondNum==thirdNum){
            System.out.println("all are equal");
        } else if(firstNum > secondNum && firstNum > thirdNum)
        {
            System.out.println("first number is greater which is ="+firstNum);
        }else if(secondNum>thirdNum){
            System.out.println("second number is greater.");
        }else {
            System.out.println("third number is greater ");
        }

    }
}
