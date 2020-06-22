package Lesson2;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int chislo = Integer.parseInt(scan.readLine());
        double f;
        if(chislo > 0 && chislo <= 20){
            f = chislo * 2.54;
            System.out.println(chislo + " дюймов = " + f + " cм");}
            else
            System.out.println("введенное число не соответствует заданным значениям.");
        }
    }

