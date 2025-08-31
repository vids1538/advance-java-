import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=JavaUtilities.inputArray();
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i+1+": "+arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("total sum ="+sum);
    }
}
