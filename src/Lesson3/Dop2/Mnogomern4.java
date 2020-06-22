package Lesson3.Dop2;

import java.util.Scanner;

public class Mnogomern4 {


    /*
    for (int g = massive.length; g > -1; g--){
            for(int r = 5; r > g; r--){                            числа над диагональю
            System.out.print (massive[g] [r-1] + " ");
            }
            System.out.println();
            }



    for (int g = 0; g < massive.length; g++){
                for(int r = 0; r < g+1; r++){                    числа под диагональю
                    System.out.print (massive[g] [r] + " ");
                }
                System.out.println();
            }


















     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int [] [] massive = new int[a] [a];
        for(int dl = 0; dl < massive.length; dl++){
            for(int dl2 = 0; dl2 < a; dl2++){
                int rand = (int)(Math.random()*10);
                massive[dl] [dl2] = rand;
                System.out.print(massive [dl] [dl2] + " ");
            }
            System.out.println();
        }
        System.out.println();

         int index = 0;
    for(int dl = 5; dl > 0; dl--){
        for(int dl2 = 4; dl2 < dl; dl2--){
            System.out.print(massive[dl-1][dl2] + " ");
        }
        System.out.println();
    }


    }
}