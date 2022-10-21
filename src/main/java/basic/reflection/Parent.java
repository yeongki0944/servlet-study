package basic.reflection;

public class Parent {
    private String str1 = "1";
    public String str2 = "2";
    public String Parent_Public_Field = "123";
    private String Parent_Private_Field ="123";

    public Parent() {
    }

    private void method1() {
        System.out.println("method1");
    }

    public void method2(int n) {
        System.out.println("method2: " + n);
    }

    private void method3() {
        System.out.println("method3");
    }
}
