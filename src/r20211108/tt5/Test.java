package r20211108.tt5;

public class Test {
    public static void main(String[] args) {

    }
}

interface IoOpenAndClose{
    public void Open(ITV itv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IoOpenAndClose{

    @Override
    public void Open(ITV itv) {
        itv.play();
    }
}
