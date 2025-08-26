import java.util.Scanner;
public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Number is positive or negative.");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Number is positive..");
        }else if (number < 0){
            System.out.println("number is negative..");
        }else {
            System.out.println("neither positive nor negative.");
        }
    }
}
