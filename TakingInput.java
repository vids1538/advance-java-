import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("this is input taking program");
        Scanner input=new Scanner(System.in);
        System.out.print("enter your name :");
        String name=input.nextLine();
        System.out.print("\nenter your age :");
        byte age=input.nextByte();
        System.out.println("enter any floating point number :");
        double floatnumber=input.nextDouble();

        System.out.println("your name is "+name);
        System.out.println("your age is "+age);
        System.out.println("your floating point number is "+floatnumber);

    }
}
