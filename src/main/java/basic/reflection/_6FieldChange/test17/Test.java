package basic.reflection._6FieldChange.test17;

import basic.reflection.Child;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        // private Field 변경해보기

        Child child = new Child();
        Class Tclass = Class.forName("basic.reflection.Child");
        Field field = Tclass.getDeclaredField("cstr2");
        field.setAccessible(true);
        field.set(child, "change22");

        System.out.println("child.cstr2: "+ field.get(child));

//        System.out.println(child.cstr1);
//        System.out.println(child.cstr2);
    }
}
