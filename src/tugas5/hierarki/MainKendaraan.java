package tugas5.hierarki;

public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 180, 4, 4);
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor("Yamaha R15", 150, 2, "4-tak");
        motor.tampilkanInfo();
    }
}
