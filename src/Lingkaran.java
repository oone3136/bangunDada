import java.util.Scanner;

public class Lingkaran extends Test {
    float r;

    @Override
    float luas() {
        float luas = (float)  (Math.PI*r*r);
        System.out.println("lingkaran adalah : " + luas);
        return luas;
    }

    @Override
    float keliling() {
        float kll = (float) (2*Math.PI*r);
        System.out.println("lingkaran : "+ kll);
        return kll;
    }
}