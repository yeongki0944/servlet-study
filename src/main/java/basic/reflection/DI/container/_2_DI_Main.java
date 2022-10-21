package basic.reflection.DI.container;

import basic.reflection.DI.TargetBean;

public class _2_DI_Main {
    public static void main(String[] args) {
        _2_DIConatiner diConatiner = new _2_DIConatiner();

        TargetBean targetBean = diConatiner.getBean(TargetBean.class);
        targetBean.hello();
    }
}

// ref - https://pocada.medium.com/java-reflection-api-3-di-%EA%B5%AC%ED%98%84-408c6e0feea7
