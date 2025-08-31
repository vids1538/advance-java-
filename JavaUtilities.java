import java.util.Scanner;

public class JavaUtilities {
   public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.println("enter value for"+i+": ");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;

    }
}
