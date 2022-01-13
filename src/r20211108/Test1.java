package r20211108;

public class Test1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.m1("汽车");
        vehicle.m1("飞机");
    }
}

class Vehicle{
    public void m1(String name){
        System.out.println(name+"在路上行走");
    }
}