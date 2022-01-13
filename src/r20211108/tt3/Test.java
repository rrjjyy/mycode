package r20211108.tt3;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1(new B());
        a.m2(new B());
        System.out.println("-----------------------");

        C c = new C();
        c.m1(new D());
        c.m2(new D());

    }
}

interface interface1 {
    void operation1();
}

interface interface2 {

    void operation2();

    void operation3();

}

interface interface3 {
    void operation4();

    void operation5();
}

class B implements interface2, interface1 {

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }


}

class D implements interface1, interface3 {


    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }


    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

class A {
    public void m1(interface1 interface1) {
        interface1.operation1();
    }

    public void m2(interface2 interface2) {
        interface2.operation2();
        interface2.operation3();
    }
}

class C {
    public void m1(interface1 interface1) {
        interface1.operation1();
    }

    public void m2(interface3 interface3) {
        interface3.operation4();
        interface3.operation5();

    }

}
