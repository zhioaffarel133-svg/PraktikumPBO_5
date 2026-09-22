package tugas5.hewan;

public class Anjing extends Hewan {
    public Anjing(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Anjing ===");
        super.tampilkanInfo();
        tampilkanSuara();
    }

    public void tampilkanSuara() {
        System.out.println("Suara: Guk guk");
    }
}
