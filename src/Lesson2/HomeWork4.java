package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(scan.readLine());
        int mnojitel = Integer.parseInt(scan.readLine());

        int summa = 0;
        for (int c = 0; c < mnojitel; c++) {
            summa = summa + chislo;
        }
        System.out.println("ответ = " + summa);
    }
}