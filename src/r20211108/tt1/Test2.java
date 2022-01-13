package r20211108.tt1;

public class Test2 {
    public static void main(String[] args) {
        RodeVehicle rodeVehicle = new RodeVehicle();
        airVehicle airVehicle = new airVehicle();
        rodeVehicle.m1("汽车");
        airVehicle.m1("飞机");
    }
}
//这样的写法遵守单一职责
//但是这样的做的改动会很大，需要将类进行分解，并且要修改客户端
class RodeVehicle{
    public void m1(String name){
        System.out.println(name+"在路上走");
    }
}


class airVehicle{
    public void m1(String name){
        System.out.println(name+"在天上飞");
    }
}