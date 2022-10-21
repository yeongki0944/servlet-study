package basic.reflection.DI.container;

import basic.reflection.DI.TargetBean;

public class _1_Java_Main {
    public static void main(String[] args) {
        TargetBean targetBean = new TargetBean();
        targetBean.hello();
        /*
            Exception in thread "main" java.lang.NullPointerException
         */

    }
}
