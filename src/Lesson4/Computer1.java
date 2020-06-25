package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Computer1 {
    public static void main(String[] args) throws Exception {
        Computer comp = new Computer("AMD", 4,250);
        comp.characteristics();
        comp.on();
        comp.off();
        comp.characteristics();
        comp.on();
        comp.on();

 //   Random r = new Random();
   // int randomValue = r.nextInt(3);
     //   Scanner scanner = new Scanner(System.in);
       // int scanValue = scanner.nextInt();



    }
}
