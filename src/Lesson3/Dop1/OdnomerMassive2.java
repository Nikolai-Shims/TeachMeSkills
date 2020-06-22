package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomerMassive2 {
    public static void main(String[] args) throws IOException{
        int summa = 0;
        int count = 0;
        int[] massive = new int[5];

        for(int a = 0; a < massive.length; a++){
            int rand = (int) (Math.random() * 20);
            massive[a] = rand;
            if(a % 2 != 0){
                summa += massive[a];
                count++;
            }
        }
        float srednee = (float) summa / count;                  // int srednee = summa / count;
        System.out.println("среднее арифметическое эллементов с нечетными индексами = " + srednee);
        System.out.println(Arrays.toString(massive));
    }
}
