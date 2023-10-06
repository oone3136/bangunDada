// Kelas abstrak
abstract class Hewan {
    private String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Metode abstrak (tanpa implementasi)
    public abstract void bersuara();

    public String getNama() {
        return nama;
    }
}

// Kelas anak 1 yang mewarisi dari Hewan
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    // Implementasi metode abstrak
    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeluarkan suara: Meow!");
    }
}

// Kelas anak 2 yang mewarisi dari Hewan
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    // Implementasi metode abstrak
    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeluarkan suara: Woof!");
    }
}

public class Abstrak {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Miming");
        Hewan anjing = new Anjing("Buddy");

        kucing.bersuara();
        anjing.bersuara();
    }
}

