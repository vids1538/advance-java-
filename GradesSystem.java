import java.util.Scanner;

public class GradesSystem {
    public static void main(String[] args) {
        System.out.println("grade system");
        Scanner sc=new Scanner(System.in);
        System.out.print(".................enter  your marks out of 100 .....................");
        System.out.println("\nenter math marks :");
        int math=sc.nextInt();
        System.out.println("enter english marks :");
        int english=sc.nextInt();
        System.out.println("enter science marks :");
        int science=sc.nextInt();
        System.out.println("enter computer marks :");
        int computer=sc.nextInt();
        int totalMarks=math+english+science+computer;
        double totalPercentage = (totalMarks * 100.0) / 400;
        if (math>100 || english>100 || science>100 || computer>100
        ||math<0 || english<0 || science<0 || computer<0) {
            System.out.println(" enter a valid number between 1 and 100");
        }
        else if(totalPercentage>=90 && totalPercentage<=100){
            System.out.println("grade A.");
        } else if(totalPercentage>=75 && totalPercentage<90){
            System.out.println("grade B.");
        }else if(totalPercentage>=60 && totalPercentage<75){
            System.out.println("grade C");
        }else if(totalPercentage>=30 && totalPercentage<60){
            System.out.println("grade D");
        }else {
            System.out.println("grade E");
        }
    }
}
