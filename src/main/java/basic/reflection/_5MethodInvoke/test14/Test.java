package basic.reflection._5MethodInvoke.test14;

import basic.reflection.Child;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Method 호출 해보기

        Child child = new Child();
        Class Tclass = Class.forName("basic.reflection.Child");
        Method method = Tclass.getDeclaredMethod("method4", int.class);

        int returnValue = (int)method.invoke(child, 10);
        System.out.println("return value: " + returnValue);

    }
}
