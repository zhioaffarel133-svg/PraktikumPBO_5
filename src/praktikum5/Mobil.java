package praktikum5;

public class Mobil extends Kendaraan {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void tampilkanInfoMobil() {
        System.out.println("=== Informasi Mobil ===");
        tampilkanInfo();
    }
}
