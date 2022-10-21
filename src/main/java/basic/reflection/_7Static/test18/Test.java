package basic.reflection._7Static.test18;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        // Static Method Invoke
        Class Tclass = Class.forName("basic.reflection.StaticExample");
        Method method = Tclass.getDeclaredMethod("getSquare", int.class);
        method.invoke(null, 10);
            // 객체를 전달하는 곳에 null을 넣으면 된다.

        // Static Field
        Field field = Tclass.getDeclaredField("EXAMPLE");
        field.set(null, "Hello Hello~~");
        System.out.println("StaticExample.EXAMPLE: "+field.get(null));


    }
}
