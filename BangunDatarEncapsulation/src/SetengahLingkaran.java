public class SetengahLingkaran extends BangunDatar{

    private int r;
    private double luas;


    public void setR(int r) {
        this.r = r;
    }

    public double getLuas() {
        this.luas = (Math.PI * r * r) /2;
        return luas;
    }

}
