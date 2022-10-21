package basic.reflection;

public class StaticExample {
    public static String EXAMPLE = "Example";

    public static int getSquare(int num){
        System.out.println("Static - Get Square: "+ num*num);

        return num*num;
    }
}
