package r20211108.tt2;

public class Test1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.m1("汽车");
        vehicle.m2("飞机");
    }
}
//这个修改方式没有对类进行较大的修改，只是对方法进行了扩展
class Vehicle{
    public void m1(String name){
        System.out.println(name+"在路上行走");
    }

    public void m2(String name){
        System.out.println(name+"在天上飞");
    }
}


