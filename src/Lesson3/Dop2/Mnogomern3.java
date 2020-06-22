package Lesson3.Dop2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Mnogomern3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            Random rand = new Random();
            int[] [] massive = new int[a] [a];

            for(int dl = 0; dl < massive.length; dl++) {
                for(int dl2 = 0; dl2 < a; dl2++){
                    massive [dl] [dl2] = (rand.nextInt(10)+1);
                    System.out.print(massive[dl] [dl2] + " ");
                }
                System.out.println();
            }
        System.out.println();

            int summa1 = 1;
            int summa2 = 1;

            for(int dl = 0; dl < massive.length; dl++){
                summa1 *= massive[dl][dl];
            }
            int index = a;

            for(int dl = 0; dl < massive.length; dl++){
            summa2 *= massive[dl] [index - 1];
            index--;
        }
        if( summa1 > summa2){
            System.out.println("произведение главной диагонали " + summa1 + " больше, чем произведение побочной диагонали " + summa2);}
        else System.out.println("произведение побочной диагонали " + summa2 + " больше, чем произведение главной диагонали " + summa1);
    }
}
