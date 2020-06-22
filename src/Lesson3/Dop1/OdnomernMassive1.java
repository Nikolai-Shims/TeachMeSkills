package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomernMassive1 {
    public static void main(String[] args) throws IOException {
        int proizvedenie = 1;
        int[] massive = new int[5];
        for(int a = 0; a < massive.length; a++) {
            int r = (int) (Math.random() * 99);
            massive[a] = r;
            if (massive[a] % 3 == 0){
                proizvedenie *= massive[a];
            }
        }
        System.out.println("Произведение всех чисел массива, которые кратны 3 = " + proizvedenie );
        System.out.println(Arrays.toString(massive));

    }

}

