package Lesson3;

import java.io.IOException;
import java.util.Arrays;

public class HomeWork6 {
    public static void main(String[] args) throws IOException {
        int [] massive = new int[4];

    for(int a = 0; a < massive.length; a++){
        int r = (int) (Math.random()* 15);
        massive[a] = r;
    }
        System.out.println(Arrays.toString(massive));

        for(int v = 0; v < massive.length-1; v++){

               if(massive[v] == massive[v+1] || massive[v] > massive[v+1]  ){
                 System.out.println("ravno");
                break;}
            else if(massive[v] < massive[v+1]){
                System.out.println("kryto");
                continue;}
            //  else if(massive[v] > massive[v+1] ){
              //   System.out.println("net");
             //break;
             }
        }
}


