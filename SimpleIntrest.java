import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("simple intrest");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle:");
        double principal=sc.nextDouble();
        System.out.println("enter time in months :");
        int time=sc.nextInt();
        System.out.println("enter yearly interest rate:");
        float rate=sc.nextFloat();
        float timeinYear=(float)time/12;
        double simpleIntrest=(principal*timeinYear*rate)/100;
        System.out.println("simple intrest is :"+simpleIntrest);
        System.out.println("total payable amount is :"+(principal+simpleIntrest));
        System.out.println("Thanks..");



    }
}
