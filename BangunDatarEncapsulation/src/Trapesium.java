public class Trapesium extends BangunDatar {
    private int sisiAtas;
    private int sisiBawah;
    private int tinggi;
    private int luas;


    public void setSisiAtas(int sisiAtas) {
        this.sisiAtas = sisiAtas;
    }

    public void setSisiBawah(int sisiBawah) {
        this.sisiBawah = sisiBawah;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLuas() {
        this.luas = (this.sisiAtas + this.sisiBawah) * this.tinggi /2;
        return this.luas;
    }

}
