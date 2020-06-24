package Lesson3.Dop1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OdnomernMassive6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        Random rand = new Random();
        boolean b = false;
        int [] massive = new int[chislo];
        for (int a = 0; a < massive.length; a++){
            massive[a] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(massive));

        for(int a = 0; a < massive.length; a++){
            for(int dlinna = a + 1; dlinna < massive.length; dlinna++){
                if(massive[a] == massive[dlinna]){
                    b = true;
                    break;
                }
            }
            if(b){
                break;}
        }
        if(b != true){
            System.out.println("эллементы не повторяются");
        }
        else{
            System.out.println("Эллементы повторяются");
        }
    }
}