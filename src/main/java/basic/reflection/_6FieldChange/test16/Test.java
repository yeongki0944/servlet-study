package basic.reflection._6FieldChange.test16;

import basic.reflection.Child;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Child child = new Child();
        Class Tclass = Class.forName("basic.reflection.Child");
        Field field = Tclass.getField("cstr1");
        System.out.println("child.cstr1: "+field.get(child));

        System.out.println("==================================");

        field.set(child, "change");
        System.out.println("child.cstr1: "+field.get(child));

    }
}
