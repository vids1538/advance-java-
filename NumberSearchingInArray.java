import java.util.Scanner;
public class NumberSearchingInArray {
    public static void main(String[] args) {
        System.out.println("searching a number in given array.");
        int [] arr={ 22,43,566,766,354,8,9646,5,76,56,34,77,89};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int myNum=sc.nextInt();
        boolean isfound=isFound(arr,myNum);
        if(isfound){
            System.out.println("number found ");
        }else{
            System.out.println("number not found .");
        }

    }
    public static boolean isFound(int [] arr,int myNum)
    {
        int index=0;
        while(index<arr.length){
            if(arr[index]==myNum){
                return true;
            }
            index++;
        }
        return false;
    }
}
