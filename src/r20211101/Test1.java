package r20211101;

public class Test1{
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.m1();
    }
}

class Outer{
    //这是一个外部类
    private int i = 100;
    private void m2(){}
    public void m1()
    {//局部内部类通常定义在类的局部位置，通常是在方法

        class inner{//局部内部类（本质上还是一个类）
            //局部内部类可以访问外部类的所有的成员，包括私有的
            //定义一个方法来验证
            private int i = 200;
            public void m3(){
                //r20211101.Outer.this可以看作是一个对象，
                System.out.println(i+"外部类的i+:"+Outer.this.i);
                m2();
            }
        }
        inner inner = new inner();
        inner.m3();
        class inner2 extends inner{

        }
    }

    {//代码块
        class inner3{
            //这个也是局部内部类
        }
    }
}