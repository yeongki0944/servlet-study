package basic.reflection._2Contructor.test4;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /*
            생성자 찾아보기2
                인자를 가지는 생성자 찾아보기
         */

        Class Tclass = Class.forName("basic.reflection.Child");
        Constructor constructor = Tclass.getDeclaredConstructor(String.class);
        System.out.println("Constructor(String): "+ constructor);

    }
}
