package Lesson2;

public class HomeWork3 {
    public static void main(String[] args){
        int a = 0;
        for(int b = 1; b <= 256; b = b * 2){
            a = a + b;
        }
        System.out.println("cумма всех чисел = " + a);
    }
}
