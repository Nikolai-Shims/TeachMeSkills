package Lesson3.Dop2;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mnogomern1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Random r = new Random();
        int count = 0;
        int [] [] massive = new int [a] [a];

        for(int stroka = 0;  stroka < massive.length; stroka++ ){
            for(int stolbec = 0; stolbec < a ; stolbec++){
                massive[stroka] [stolbec] = (r.nextInt(10)+1);
                System.out.print(massive[stroka][stolbec] + " ");
            }
            System.out.println();
        }

        for(int stroka = 0; stroka < massive.length; stroka++){
            if(massive[stroka][stroka] % 2 == 0){
                count = count + massive[stroka] [stroka];
            }
        }
        System.out.println();
        System.out.println("Сумма четных эллементов главной диагонали = " + count);

    }
}
