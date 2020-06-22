package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;

public class OdnomernMassive4 {
    public static void main(String[] args) throws IOException{
        int [] massive = new int[10];
        int min = Integer.MAX_VALUE;

        for(int a = 0; a < massive. length; a++){
            int r = (int)(Math.random()*15);
            massive[a] = r;
            if(massive[a] % 2 != 0){
                int sd  = massive[a];
                if(sd < min){
                    min = sd;
                }
            }
        }

        System.out.println(Arrays.toString(massive));
        System.out.println("наименьший нечетный эллемент в массиве = " + min);
    }
}
