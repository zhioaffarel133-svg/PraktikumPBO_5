package tugas5.hierarki;

public class Mobil extends KendaraanDarat {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mobil ===");
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
