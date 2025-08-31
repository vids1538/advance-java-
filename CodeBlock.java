public class CodeBlock {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;

    static {  //   this section is known as static section , when jvm seen this class named "CodeBlock"
             // jvm load this static section into memory although object created or not no matters
            // it is just like initialization
        noOfCarsSold = 0;
    }

    {
        // and this section is known as normal block, and it will run first before all the constructor
        noOfCarsSold++;
    }
    public static void main(String[] args)
    {
        CodeBlock cb = new CodeBlock();
        CodeBlock cb2 = new CodeBlock();
        System.out.print(noOfCarsSold);  // 2 car sold coz two object created 
    }
}
