package basic.reflection._3Method.test9;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Method 찾기3
            // 모든 메소드 찾기

        Class Tclass = Class.forName("basic.reflection.Child");
        Method methods[] = Tclass.getDeclaredMethods();

        for(Method method : methods){
            System.out.println("get methods: "+ method);

        }







    }
}
