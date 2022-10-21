package basic.reflection._2Contructor.test3;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /*
            생성자 찾아보기
         */

        Class Tclass = Class.forName("basic.reflection.Child");
        Constructor constructor = Tclass.getDeclaredConstructor();
        System.out.println("Constructor: "+ constructor);


    }
}
