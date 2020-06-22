package Lesson3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(scan.readLine());

        if (a > 3) {
            int dlinna = 0;
            int[] massive = new int[a];

            for (int b = 0; b < massive.length; b++) {
                int getChislo = (int) (Math.random() * a);
                massive[b] = getChislo;
                if (massive[b] % 2 == 0) {
                    dlinna++;
                }
            }
            System.out.println(Arrays.toString(massive) + " первый массив равен введенному числу " + a + ".");
            int[] massive2 = new int[dlinna];
            int index = 0;

            for (int d = 0; d < massive.length; d++) {
                if (massive[d] % 2 == 0) {
                    massive2[index] = massive[d];
                    index++;
                }
            }
            System.out.println(Arrays.toString(massive2) + " создали ворой массив из четных элементов первого массива.");
        }
        else
            System.out.println("Введено неправильное число.");
    }
}