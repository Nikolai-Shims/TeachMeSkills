package Lesson2;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        double km = 10;
      double summa = 10;

        for(int a = 1; a < 7; a++){
            double c = km * 0.1;
            km += c;
            summa += km;
        }
        
        System.out.println(summa);
}

}
 */

        int[] massiv = new int[5];
        massiv [0] = 10;
        massiv[1]  = 2;
        massiv[2] = 4;
        massiv[1]  = 5;
        massiv  [4] = 1;
        Arrays.sort(massiv);
        for (int i = 0; i < massiv.length; i++) {


                System.out.println(massiv[i]);
            }

        }
    }
