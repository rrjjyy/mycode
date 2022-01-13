package r20211102.r01;

public class Test1 {
    public static void main(String[] args) {
//匿名内部类对接口的实现，举例
        m1(new A() {

            @Override
            public void show() {
                System.out.println("匿名内部类实现接口测试");
            }
        });

        m1(new B());
    }

    public static void m1(A a) {
        a.show();
    }
}

interface A {
    void show();
}

//传统方法

class B implements A {

    @Override
    public void show() {
        System.out.println("传统接口实现测试");
    }
}




