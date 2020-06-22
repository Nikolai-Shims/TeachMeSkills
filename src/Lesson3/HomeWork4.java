package Lesson3;

import java.io.IOException;

public class HomeWork4 {
    public static void main(String[] args) throws IOException{
        int [] massive = new int[20];
        for(int a = 0; a < massive.length; a++){
            massive [a] = (int) (Math.random() * 20);
            System.out.print(massive[a] + " ");
            if(a % 2 != 0){
                massive[a] = 0;
            }
        }
        System.out.println();
        for (int d = 0; d < massive.length; d++){
            System.out.print(massive[d]+ " ");
        }
        System.out.println("  --> каждый эллемент с нечетным индексом заменяем на 0.");

    }
}
