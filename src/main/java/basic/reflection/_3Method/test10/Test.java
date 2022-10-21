package basic.reflection._3Method.test10;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Method 찾기4
            // public 메소드만 찾기


        Class Tclass = Class.forName("basic.reflection.Child");
        Method methods[] = Tclass.getMethods();

        for(Method method : methods){
            System.out.println("get methods: "+ method);

        }

        // 공통적으로 함수 이름에 Declared가 들어가면 Super 클래스의 정보는 가져오지 않습니다.

        // getMethods()는 public 메소드를 리턴해주며, 상속받은 메소드들도 모두 찾아줍니다.



    }
}
