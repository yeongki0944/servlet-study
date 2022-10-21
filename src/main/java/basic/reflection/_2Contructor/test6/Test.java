package basic.reflection._2Contructor.test6;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // public 생성자만 찾아보기
        Class Tclass = Class.forName("basic.reflection.Child");
        Constructor constructors[] = Tclass.getConstructors();

        for(Constructor cons : constructors){
            System.out.println("Constructor(String): "+ cons);
        }

    }
}
