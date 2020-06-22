package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {
       /*
        int d = 0;
        for(int a = 1; a < 100; a++){
            if(a % 2 != 0){
                d = d + a; }
        }
        System.out.println("сумма всех нечетных чисел " + d);
    }
}

        */
        int j = 0;
        int[][] massive = new int[3][4];
        massive[0] [0] = 1;
        massive[0] [1] = 5;
        massive[0] [2] = 7;
        massive[0] [3] = 10;

        massive[1] [0] = 2;
        massive[1] [1] = 7;
        massive[1] [2] = 9;
        massive[1] [3] = 16;

        massive[2] [0] = 3;
        massive[2] [1] = 11;
        massive[2] [2] = 2;
        massive[2] [3] = 0;

        for (int a = 0; a < massive.length; a++) {
            for (int v = 0; v < massive[a].length; v++) {
                System.out.print(massive [a] [v]+ " ");
                if (j < massive[a][v]) {
                    j = massive[a][v];
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println(j);
    }
}