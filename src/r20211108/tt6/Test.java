package r20211108.tt6;

public class Test {
    public static void main(String[] args) {
        new OpenAndClose(new ITV() {
            @Override
            public void play() {
                System.out.println("hello");
            }
        }).Open();
    }
}


interface IOpenAndClose{
    public void Open();
}

interface ITV{
    public void play();
}

//class Play implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("来玩");
//    }
//}

class OpenAndClose implements  IOpenAndClose{

    private ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void Open() {
        this.tv.play();
    }
}