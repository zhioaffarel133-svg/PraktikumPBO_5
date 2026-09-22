package tugas5.hewan;

public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", "Kucing Persia");
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing("Buddy", "Anjing Golden Retriever");
        anjing.tampilkanInfo();
    }
}
