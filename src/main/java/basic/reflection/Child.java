package basic.reflection;

public class Child extends Parent {
    public String cstr1 = "1";
    private String cstr2 = "2";
    public int cint1 = 3;

    public Child() {
    }

    private Child(String str) {
        cstr1 = str;
    }

    public Child(String cstr, int cint) {
        this.cstr1 = cstr;
        this.cint1 = cint;
    }


    public int method4(int n) {
        System.out.println("method4: " + n);
        return n;
    }

    public void method4_1(){
        System.out.println("method4_1");
    }
    public void method4_2(int n1, int n2, String str1){
        System.out.println("method4_2");
    }

    private int method5(int n) {
        System.out.println("method5: " + n);
        return n;
    }


}