package basic.reflection.DI_v2.container;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

// ref - https://ncucu.me/148
public class ContainerService {

    // static 사용하는 이유. Container를 new 안할려고

    // <T> 제네릭관련해서

    // functional programming

    // getDeclaredFields -> getAnnotation
    public static <T> T getObject(Class<T> classType){
        T instance = createInstance(classType);

        Arrays.stream(classType.getDeclaredFields()).forEach( f -> {
            if(f.getAnnotation(Inject.class) != null){
                System.out.println("[log] Field : " + f.getName());
                System.out.println("[log] Field Annotation : " + f.getAnnotation(Inject.class));

                Class<?> type = f.getType();
                System.out.println("[log] Object type : " + f.getType());

                Object instance1 = createInstance(type);
                f.setAccessible(true);

                try {
                    f.set(instance, instance1);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        return instance;
    };


    private static <T> T createInstance(Class<T> classType){
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


}
