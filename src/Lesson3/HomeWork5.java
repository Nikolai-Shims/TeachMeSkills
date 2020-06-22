package Lesson3;

import java.io.IOException;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        int count1 = 0;
        int count2 = 0;
        int index = 0;
        int index2 = 0;

        int[] massive = new int[5];
        int[] massive2 = new int[5];
        for(int a = 0; a < massive.length; a++){
            int r = (int) (Math.random()*15);
            massive[a] = r;
            count1 += massive[a];
            index++;

        }

        for(int b = 0; b < massive2.length; b++){
            int r = (int)(Math.random() * 15);
            massive2[b] = r;
            count2 += massive2[b];
            index2++;
        }
        System.out.println(Arrays.toString(massive));
        System.out.println(Arrays.toString(massive2));

        double amount = (double) count1 / index;
        double amount2 = (double) count2 / index2;

        if(count1 > count2){
        System.out.println("среднее арифметическое первого массива " + amount +  " больше, чем второго массива " + amount2 + ".");}
        else if(count1 < count2 ){
        System.out.println("среднее аррифметическое первого массива " + amount  +  " меньше, чем второго массива " + amount2 + ".");}
        else
            System.out.println("массивы равны");
    }
}