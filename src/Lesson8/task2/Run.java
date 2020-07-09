package Lesson8.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) throws IOException {

        try (BufferedReader read = new BufferedReader(new FileReader("src\\Lesson8\\task2\\text"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Lesson8\\task2\\copyText"))) {
            String str;

            while ((str = read.readLine()) != null) {

                if (TextFormater.getPalindrome(str) == true || TextFormater.countWords(str) >= 3 && TextFormater.countWords(str) <= 5) {
                    writer.write(str);
                    writer.newLine();
                }
            }
        }

    }
}






