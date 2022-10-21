package basic.reflection._2Contructor.test5;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /*
            생성자 찾아보기3
               모든 생성자 찾기
         */

        Class Tclass = Class.forName("basic.reflection.Child");
        Constructor constructors[] = Tclass.getDeclaredConstructors();

        for(Constructor cons : constructors){
            System.out.println("Constructor(String): "+ cons);
        }

    }
}
