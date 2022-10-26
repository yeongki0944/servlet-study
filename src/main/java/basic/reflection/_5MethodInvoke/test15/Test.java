package basic.reflection._5MethodInvoke.test15;

import basic.reflection.Child;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Method 호출 해보기2
            // Private 메소드 호출


        Child child = new Child();
        Class Tclass = Class.forName("basic.reflection.Child");
        Method method = Tclass.getDeclaredMethod("method5", int.class);
        method.setAccessible(true);
        method.invoke(child, 10);
        /*
            Error 발생
            java.lang.IllegalAccessException

            method가 private이기 때문에
         */
    }
}
