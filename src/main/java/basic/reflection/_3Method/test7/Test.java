package basic.reflection._3Method.test7;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Method 찾기1

        Class Tclass = Class.forName("basic.reflection.Child");
        Method method = Tclass.getDeclaredMethod("method4", int.class);
        System.out.println("Find method4 in Child: "+ method);

        Method method_Null = Tclass.getDeclaredMethod("method4_1", null);
        System.out.println("Find method4_1 in Child: "+ method_Null);
    }
}
