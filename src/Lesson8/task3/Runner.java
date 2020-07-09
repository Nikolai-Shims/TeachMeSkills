package Lesson8.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        List<String> blaclist = new ArrayList<String>();
        List<String> text = new ArrayList<String>();
        int count = 0;
        boolean b = false;

        try (BufferedReader read = new BufferedReader(new FileReader("src\\Lesson8\\task3\\blackList"));
        ) {
            String str;
            while ((str = read.readLine()) != null) {

                blaclist.add(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader read = new BufferedReader(new FileReader("src\\Lesson8\\task3\\text"))) {
            String str2;
            while ((str2 = read.readLine()) != null) {
                text.add(str2);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int a = 0; a < text.size(); a++) {
            for (int t = 0; t < blaclist.size(); t++) {
                if (text.get(a).contains(blaclist.get(t))) {
                    count++;
                    b = true;
                    System.out.println("Предложение: \"" + text.get(a) + "\" содержит запрещенное слово.");
                    break;
                }
            }
        }

        if (b == false) {
            System.out.println("Текст прошел проверку.");
        } else {
            System.out.println("Текст не прошел проверку! Колличество неверных предложений = " + count);
        }
    }
}
