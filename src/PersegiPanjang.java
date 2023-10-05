import java.util.Scanner;

public class PersegiPanjang extends Test{
    float panjang;
    float lebar;

    @Override
    float luas() {
        float luas = panjang * lebar;
        System.out.println("Persegipanjang = "+ luas);
        return luas;
    }

    @Override
    float keliling() {
        float kll = 2*panjang + 2*lebar;
        System.out.println("persegi panjang = " + kll);
        return kll;
    }
}
