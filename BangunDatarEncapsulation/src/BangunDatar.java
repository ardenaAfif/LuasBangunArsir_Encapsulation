/*
    Nama    : Ardena Afif Pratama
    NIM     : 422021611016
 */

public class BangunDatar {

    public static void main(String[] args) {
        // Menghitung Luas Trapesium
        Trapesium trapesium = new Trapesium();
        trapesium.setSisiAtas(14);
        trapesium.setSisiBawah(30);
        trapesium.setTinggi(7);

        double luasTrapesium = trapesium.getLuas();

        // Menghitung Luas Setengah Lingkaran
        SetengahLingkaran SetLingkaran = new SetengahLingkaran();
        SetLingkaran.setR(7);

        double luasSetLingkaran = SetLingkaran.getLuas();


        // Menghitung Luas daerah Arsir
        double luasArsir = luasTrapesium - luasSetLingkaran;
        System.out.println("Luas Bangun Datar yang diarsir = Luas Trapesium - Luas Setengah Lingkaran");
        System.out.print(luasTrapesium + " - " + luasSetLingkaran + " = " + luasArsir);

    }
}
