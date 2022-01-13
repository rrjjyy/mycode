package r20211108.tt4;

public class Test {
    public static void main(String[] args) {
        People people = new People();
        people.getEmail(new Email());
        people.getEmail(new Weixin());


    }
}

interface IA{
    void getinfor();
}

class Email implements IA{
    public void getinfor(){
        System.out.println("收到电子邮件信息");
    }
}

class Weixin implements IA{

    @Override
    public void getinfor() {
        System.out.println("收到微信信息");
    }
}

class People{
    public void getEmail(IA ia){
        ia.getinfor();
    }
}
