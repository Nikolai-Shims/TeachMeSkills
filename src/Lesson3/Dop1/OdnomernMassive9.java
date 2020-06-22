package Lesson3.Dop1;

import java.io.IOException;

public class OdnomernMassive9 {
    public static void main(String[] args) throws IOException{
        int min = Integer.MAX_VALUE;
        int[] massive = new int[10];

        for(int a = 0; a < massive.length; a++){
            int r = (int)(Math.random()*15);
            massive[a] = r;
            if(a % 2 == 0) {
                if(massive[a] < min){
                    min = massive[a];
                }
            }
           System.out.print(massive[a] + " ");
        }
        System.out.println();
        System.out.print("минимальный эллемент из четных индексов = " + min);
    }
}
