package Spring.ref;

public class AA {
    private  int xx;
    private BB obj;

    public int getXx() {
        return xx;
    }

    public void setXx(int xx) {
        this.xx = xx;
    }

    public BB getObj() {
        return obj;
    }

    public void setObj(BB obj) {
        this.obj = obj;
    }

    public AA(int xx, BB obj) {
        this.xx = xx;
        this.obj = obj;
    }

    public AA() {
        super();
    }

    @Override
    public String toString() {
        return "AA{" +
                "xx=" + xx +
                ", obj=" + obj +
                '}';
    }
}
