import java.util.Scanner;

public class FarenhietToCelcius {
    public static void main(String[] args) {
        System.out.println("Fahrenheit To Celsius");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your temperature in fahrenheit :");
        float fahrenheit=input.nextFloat();
        float celsius=(fahrenheit-32)*5.0f/9.0f;
        System.out.println("temp in celsius:"+celsius+"C");
    }
}
