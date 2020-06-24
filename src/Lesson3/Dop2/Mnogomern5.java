package Lesson3.Dop2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mnogomern5 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            Random r = new Random();
            int [] [] massive2 = new int [5][5];
            int [] [] massiv = new int[5] [5];
            for (int s = 0; s < massiv.length; s++){
                for(int f = 0; f < massiv[0].length; f++){
                    massiv[s][f] = r.nextInt(10);
                }
            }

            for (int s = 0; s < massiv.length; s++){
                for(int f = 0; f < massiv[0].length; f++){
                    System.out.print(massiv[s] [f] + " ");
                }
                System.out.println();
            }
            System.out.println("*********");

            for (int s = 0; s < massiv.length; s++) {
                for (int f = 0; f < massiv[0].length; f++) {
                    massive2[f][s]  = massiv[s][f];
                }
            }
            for (int s = 0; s < massiv.length; s++){
                for(int f = 0; f < massiv[0].length; f++){
                    System.out.print(massive2[s] [f] + " ");
                }
                System.out.println();
            }


        }


    }

