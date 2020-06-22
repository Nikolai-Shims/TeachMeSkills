package Lesson1;

import com.sun.deploy.security.SelectableSecurityManager;

public class HomeWork {
    public static void main(String[] args) {
        int a = -10000;

        if (a > 0) {
            int count = (a == 0) ? 1 : 0;
            while (a != 0) {
                count++;
                a /= 10; }
            System.out.println("положительное " + count + " значное число");
        }

        else if(a < 0){
            int counts2 = (a == 0) ? 1 :0;
            while (a != 0) {
                counts2++;
                a /=10; }
            System.out.println("отрицательное " +counts2+ " значное число");
        }
    }
}
