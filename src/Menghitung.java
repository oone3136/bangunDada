import java.util.Scanner;

public class Menghitung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Pilih bentuk apa yang ingin Anda hitung (lingkaran/segitiga/persegiPanjang):");
                String pilihan = input.next();

                if (pilihan.equals("lingkaran")) {
                    Lingkaran lingkaran = new Lingkaran();
                    System.out.println("Masukkan nilai r : ");
                    lingkaran.r = input.nextFloat();
                    lingkaran.luas();
                    lingkaran.keliling();
                } else if (pilihan.equals("segitiga")) {
                    Segitiga segitiga = new Segitiga();
                    System.out.println("Masukkan nilai alas : ");
                    segitiga.alas = input.nextFloat();
                    System.out.println("Masukkan nilai tinggi : ");
                    segitiga.tinggi = input.nextFloat();
                    segitiga.luas();
                    segitiga.keliling();
                } else if (pilihan.equals("persegiPanjang")) {
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    System.out.println("Masukkan nilai panjang : ");
                    persegiPanjang.panjang = input.nextFloat();
                    System.out.println("Masukkan nilai lebar : ");
                    persegiPanjang.lebar = input.nextFloat();
                    persegiPanjang.luas();
                    persegiPanjang.keliling();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine(); // Membersihkan masukan yang salah
            }

            System.out.println("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String ulangi = input.next();

            if (!ulangi.equalsIgnoreCase("ya")) {
                break; // Keluar dari loop jika pengguna tidak ingin menghitung lagi
            }
        }

        input.close();
    }

}

