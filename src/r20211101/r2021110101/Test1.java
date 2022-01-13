package r20211101.r2021110101;

public class Test1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}

class Outer {
    private int i = 100;

    public void m1() {
//        A tiger = new Tiger();
//        tiger.cry();
        //如果不想建新的类,或者说新建的这个类的用的次数很少，就要实现A这个接口，那么就可以使用匿名内部类
        //tiger的编译类型为 A
        //tiger的运行类型为系统自动取名，通常为类名+$1
        //匿名内部类使用一次之后就不能再次使用了，但是对象可以反复调用//
        //演示居于接口的匿名内部类
        A tiger = new A() {

            @Override
            public void cry() {
                System.out.println("cry");
            }
        };
        tiger.cry();

        //演示基于类的匿名内部类
        /*
        father的编译类型是Fahter，运行类型是系统自动命名(class r20211101.r2021110101.Outer$2)，
        可以通过对象调用getClass来获得
        底层实现
        class Outer$2 extends Father{
        }
         */
        Father father = new Father("ren") {
            @Override
            public void test() {
                super.test();
                System.out.println("匿名内部类重写了");
            }
        };
        System.out.println(father.getClass());
        father.test();
        //基于抽象类实现的匿名内部类
        Cat cat = new Cat() {

            @Override
            void m2() {
                System.out.println("cat is fish");
            }
        };
        cat.m2();
    }
}

interface A {
    public void cry();
}

class Tiger implements A {

    @Override
    public void cry() {
        System.out.println("cry");
    }
}

class Father {
    public Father(String name) {

    }

    public void test() {

    }
}

abstract class Cat{
    public void m1(){

    }

    abstract void m2();
}