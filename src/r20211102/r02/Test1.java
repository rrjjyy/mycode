package r20211102.r02;
/*
1.有一个铃声接口Bell,里面有个ring方法。

2.有一个手机类Cllphone,具有闹钟功能
alarmclock,参数是Bell类型

3.测试手机类的闹钟功能，通过匿名内部类
(对象)作为参数，打印:懒猪起床了

4.再传入另一个匿名内部类(对象),打印:
小伙伴上课了

 */
public class Test1 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}