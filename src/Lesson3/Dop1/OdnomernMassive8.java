package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class OdnomernMassive8 {
    public static void main(String[] args) throws IOException{
        Random r = new Random();
        int [] massive = new int[10];
        for (int a = 0; a < massive.length; a++){
            massive[a] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(massive) + " получаем массив.");
        Arrays.sort(massive);

        int st = massive.length -2;
        System.out.println(massive[st] + ", второй по величине эллемент в массиве.");

    }
}
