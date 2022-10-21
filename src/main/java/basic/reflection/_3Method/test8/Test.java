package basic.reflection._3Method.test8;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Method 찾기2
            // 파라미터가 2개 이상인 메소드

        Class Tclass = Class.forName("basic.reflection.Child");
        Class parameterTypes[] = new Class[3];
        parameterTypes[0] = int.class;
        parameterTypes[1] = int.class;
        parameterTypes[2] = String.class;

        Method method = Tclass.getDeclaredMethod("method4_2", parameterTypes);
        System.out.println("Find method4_2 in Child: "+ method);

        Method method2 = Tclass.getDeclaredMethod("method4_2", int.class, int.class, String.class);
        System.out.println("Find method4_2 in Child: "+ method2);

    }
}
