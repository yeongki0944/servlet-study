package basic.reflection.DI.container;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class _2_DIConatiner {
    private Map<Class<?>, Object> beanMap = new HashMap<>();

    public _2_DIConatiner() {
        createBean();
    }

    public <T> T getBean(Class<T> clazz){
        return (T) this.beanMap.get(clazz);
    }

    public void createBean(){
        Class<?> targetClazz = null;
        try {
            targetClazz = Class.forName("basic.reflection.DI.TargetBean");
            Class<?> beanClazz = Class.forName("basic.reflection.DI.MyBean");
            Object target = targetClazz.getConstructor().newInstance();
            Object bean = beanClazz.getConstructor().newInstance();

            injectBean(target, bean);
            this.beanMap.put(targetClazz, target);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void injectBean(Object target, Object bean){
        try{
            Field myBean = target.getClass().getDeclaredField("myBean");
            myBean.setAccessible(true);
            myBean.set(target, bean);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
