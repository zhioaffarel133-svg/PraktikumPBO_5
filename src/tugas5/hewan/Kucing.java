package tugas5.hewan;

public class Kucing extends Hewan {
    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Kucing ===");
        super.tampilkanInfo();
        tampilkanSuara();
    }

    public void tampilkanSuara() {
        System.out.println("Suara: Meong");
    }
}
