package Example2;

import javafx.print.Printer;

public class Program {
    public static void main(String[] args) {


        Information inform = new Information();
        String[] words = {"tom", "fred", "boby"};
        Integer[] numbers = {23, 15, 15, 6, 7,};

        inform.<String>print(words);

                inform.<Integer>print(numbers);
    }
}
