package Lesson3.Dop2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mnogomern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int [] [] massiv = new int[a][a];

        for(int dl = 0; dl < massiv.length; dl++){
            for(int dl2 = 0; dl2 <massiv[0].length; dl2++){
                int rand = (int)(Math.random()*15);
                massiv[dl][dl2]= rand;
                System.out.print(massiv[dl][dl2] + " ");}
            System.out.println();
        }
        System.out.println();
        int index = 0;
        int index2 = 0;
        int fg = 0;
        int stolbec = 0;

        int [] [] massive2 = new int[a][a];
        for(int stroka = 0; stroka < massive2.length; stroka++){

            for (; stolbec < massive2[0].length; stolbec++){


                for(; fg < massiv.length; fg++){

                }
                massive2 [stroka][stolbec] = massiv[fg][0];
                System.out.print(massive2[stroka][stolbec]+ " ");

            }
            System.out.println();
            }
            index2++;

        }


    }
