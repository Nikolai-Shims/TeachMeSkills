package Lesson3;

import java.io.IOException;
import java.util.Arrays;

public class HomewWork2 {
    public static void main(String[] args) throws IOException{
        int [] massive = new int[50];
        for(int a = 0; a < massive.length; a++){
            massive[a] = (a + 1) * 2 - 1;
        }
        //System.out.println(Arrays.toString(massive));
        for(int s = 0; s < massive.length; s++){
            System.out.print(massive[s] + " ");
        }
        System.out.println();
        for(int s = 49; s > -1; s--){
            System.out.print(massive[s] + " ");
        }
    }
}
