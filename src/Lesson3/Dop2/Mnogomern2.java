package Lesson3.Dop2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.Scanner;

public class Mnogomern2 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[][] massive = new int[a][a];
        for(int stroka = 0; stroka < massive.length; stroka++){
            for(int stolbec = 0; stolbec < a; stolbec++){
                int random = (int) (Math.random() * 10);
                massive[stroka] [stolbec] = random;
            }
        }
        for(int g = 0; g < massive.length; g++){
            for(int cc = 0; cc < a; cc++){
                System.out.print(massive[g] [cc] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int g = 0; g < massive.length; g++){
            for(int r = 0; r < g + 1; r++){                    // если выводить без диагонали, то   r < g;
                if(massive[g] [r] % 2 != 0){
                    System.out.print(massive[g] [r] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("все нечетные эллементы под главной диагональю(включительно)");
    }
}
