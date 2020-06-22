package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomernMassive3 {
    public static void main(String[] args) throws IOException{
        int c = 5;
        int summa = 0;
        int count = 0;
        int [] massive = new int[5];

        for(int a = 0; a < massive.length; a++){
            int r = (int)(Math.random() * 20);
            massive[a] = r;
            if(massive[a] > c){
                summa += massive[a];
                count++;
            }
        }
        float srednee = (float) summa / count;
        System.out.println(srednee + " --> среднее арифметическое чисел, которые больше " + c);
        System.out.println(Arrays.toString(massive));
    }
}
