package Lesson3;

import java.io.IOException;
import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) throws IOException{
        int[] massive = new int[12];
        int maxValue = 0;
        int index = 0;

        for(int f = 0; f < massive.length; f++){
            int d = (int) (Math.random()*15);
            massive[f] = d;
            if(maxValue < massive[f]){
                maxValue = massive[f];
                index = f;
            }
        }
        System.out.println(Arrays.toString(massive) + "  --> наш массив");
        System.out.println(maxValue + " --> максимальное значение");
        System.out.println(index + " --> индекс");
    }
}
