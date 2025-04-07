package Spring.ref;

public class BB {
    private  int yy;

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public BB(int yy) {
        this.yy = yy;
    }
    public BB() {
        super();
    }

    @Override
    public String toString() {
        return "BB{" +
                "yy=" + yy +
                '}';
    }
}
