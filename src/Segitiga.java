import java.util.Scanner;

public class Segitiga extends Test {
    float alas;
    float tinggi;
    @Override
    float luas() {
        float luas = 1/2 *(alas*tinggi);
        System.out.println("segitiga = " + luas);
        return super.luas();
    }
}
