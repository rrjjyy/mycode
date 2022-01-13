package r20211108.tt7;

public class Test {
    public static void main(String[] args) {
        OpenAndeClose openAndeClose = new OpenAndeClose();
        openAndeClose.setTV(new ITV() {
            @Override
            public void Play() {
                System.out.println("hello");
            }
        });
        openAndeClose.OPen();
    }
}

interface IOpenAndClose{
    void OPen();
    void setTV(ITV itv);
}
interface ITV{
    void Play();
}
class OpenAndeClose implements IOpenAndClose{

    private ITV itv;

    @Override
    public void OPen() {
        this.itv.Play();
    }

    @Override
    public void setTV(ITV itv) {
        this.itv = itv;
    }
}