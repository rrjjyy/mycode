package r20211102;

public class r03 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
        //如何去new一个内部类，
        A.B b = a.new B();
        b.m1();
        //可以在写一个方法，然后返回内部类的对象
        A.B b1 = a.f2();
    }
}

class A{
    private int i = 10;
    public String s = "hello";

    //成员内部类
    class B{
        public void m1(){
            System.out.println(i+s);
        }
    }

    public void f1(){
        B b = new B();
        b.m1();
    }
//写一个方法来返回B对象
    public B f2(){
        return new B();
    }
}
