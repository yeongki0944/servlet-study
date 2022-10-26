package basic.reflection._1Class.test2;

public class Test {
    public static void main(String[] args) {
        /*
            Child 클래스를 import하지 말고 "basic.reflection.Child" 문자열로 getClass 메소드 실행해보기

         */

        Class Tclass = null;
        try {
            Tclass = Class.forName("basic.reflection.Child");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class name by forName : " + Tclass.getName());

    }
}
