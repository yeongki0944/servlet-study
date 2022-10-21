package basic.reflection._4Field.test13;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // 선언된 모든 Field 찾기 + 상속받은 것 까지 모두 찾기

        Class Tclass = Class.forName("basic.reflection.Child");
        Field fields[] = Tclass.getFields();
        for(Field f : fields){
            System.out.println("Find Field in Child: "+ f);
        }


    }
}
