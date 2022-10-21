package basic.reflection._4Field.test11;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class Tclass = Class.forName("basic.reflection.Child");
        Field field = Tclass.getDeclaredField("cstr1");
        System.out.println("Find Field in Child: "+ field);
    }
}
