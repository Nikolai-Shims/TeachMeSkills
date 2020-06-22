package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HomewWork1 {
    public static void main(String[] args) throws IOException {
        int[] massive = new int[10];
        for (int a = 0; a < massive.length; a++) {
            massive[a] = (a + 1) * 2;
        }
        System.out.println(Arrays.toString(massive));

        for (int o = 0; o < massive.length; o++) {
            System.out.println(massive[o]);
        }
    }
}
