package Lesson3;

import java.io.IOException;
import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) throws IOException{
        int [] massive1 = new int[10];
        int [] massive2 = new int[10];
        double [] massive3 = new double[10];
        int index1 = 0;
        int index2 = 0;

        for(int a1 = 0; a1 < 10; a1++){
            int r1 = (int) (Math.random()*9);
            int r2 = (int)(Math.random()*9);
            massive1[a1] = r1;
            massive2[a1] = r2;
        }

        for(int a3 = 0; a3 < massive3.length; a3++){
            massive3[a3] = (double) massive1[index1] / massive2[index2];
            index1++;
            index2++;
        }
        int celoeChislo = 0;

        for(int dl = 0; dl < massive3.length; dl++){
            if (massive3[dl] % 1 == 0){
                celoeChislo++;
            }
        }
        System.out.println(Arrays.toString(massive1) + " первый массив.");
        System.out.println(Arrays.toString(massive2) + " второй массив.");
       System.out.println(Arrays.toString(massive3) + " в результате деления 1го массива на 2ой, получили 3ий массив");
       System.out.print("Колличество целых эллементов в 3ем массиве = " + celoeChislo);
    }
}
