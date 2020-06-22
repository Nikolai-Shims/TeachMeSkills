package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomernMassive5 {
    public static void main(String[] args) throws IOException {
        int [] massive = new int[8];
        for(int a = 0; a < massive.length; a++) {
            int r = (int) (Math.random() * 20);
            massive[a] = r;
        }
        System.out.println(Arrays.toString(massive));

        for(int b = 0; b < massive.length -1; b = b + 2){
            massive[b] = 0;
        }
        System.out.println(Arrays.toString(massive) + " каждый второй эллемент заменили на 0");
    }
}
