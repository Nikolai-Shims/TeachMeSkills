package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomernMassive10 {
public static void main(String[] args) throws IOException {
    int max = Integer.MIN_VALUE;
    int [] massive = new int[10];
    int indexMax = 0;

    for(int a = 0; a < massive.length; a++) {
        int r = (int) (Math.random() * 20);
        massive[a] = r;
        if (massive[a] > max) {
            max = massive[a];
            indexMax = a;
        }
    }
    System.out.println(Arrays.toString(massive) + " первоночальный массив.");

    int index1 = massive[0];
    massive[0] = max;
    massive[indexMax] = index1;

    System.out.println(Arrays.toString(massive) + " 1-ый индекс и индекс максимального эллемента меняются местами");
}
}