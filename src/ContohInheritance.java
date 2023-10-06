// Kelas Induk (Superclass)
class Kendaraan {
    protected String brand = "Ford";

    public void suaraKlakson() {
        System.out.println("Tuuuuuuuut");
    }
}

// Kelas Anak (Subclass)
class Mobil extends Kendaraan {
    private String modelName = "Mustang";

    public void tampilModel() {
        System.out.println("Model: " + modelName);
    }
}

public class ContohInheritance {
    public static void main(String[] args) {
        Mobil myCar = new Mobil();

        // Mengakses atribut dari superclass
        System.out.println("Merek: " + myCar.brand);

        // Mengakses metode dari superclass
        myCar.suaraKlakson();

        // Mengakses atribut dari subclass
        myCar.tampilModel();
    }
}