import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("odd or Even ");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=sc.nextInt();
        if(number%2==0&& number>0){
            System.out.println("number is even ");
        }else if(number%2!=0) {
            System.out.println("number is odd.");
        }else if(number==0){
            System.out.println("number is ZERO");
        }

    }
}
