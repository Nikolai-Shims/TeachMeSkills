package Lesson1;

import com.sun.deploy.security.SelectableSecurityManager;

public class HomeWork2 {
    public static void main(String[] args){
        int a = 2;
        int b = 10;
        int c = 4;
        boolean triangle = true;

        if((a+b) < c | (a+c) < b | (b+c) < a)
           triangle = false;
            else
            triangle = true;

        System.out.println(triangle);

    }
}
