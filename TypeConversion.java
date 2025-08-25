public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("..............Type conversion............");
        //byte->short->int->long->float->double   = widening /implicit type casting
        //double->float->long->int->short->byte   = narrowing /explicit type casting
        float a=44.6f;
        int b=(int)a;  // explicit type casting -- means convert the a into int type
        double d=a;  // implicit typecasting
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        byte age=32;
        int age2=age;
        System.out.println(age2);


    }
}
