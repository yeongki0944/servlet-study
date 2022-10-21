package basic.reflection._1Class.test1;

import basic.reflection.Child;

public class Test {
    public static void main(String[] args) {
        /*
            1. Class<T> 객체가 존재한다는 사실을 알기
            2. Class<T> 역할 이해
            3. getName() 메소드 실행해보기
         */
        Class Tclass = Child.class;
        System.out.println("Class Name : " + Tclass.getName());
    }
}
