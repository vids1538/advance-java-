import java.util.Scanner;
public class WelcomeByName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name:");
        String name=sc.nextLine();
        System.out.println("welcome "+name+" to kg codding ");
    }
}
