package Lesson8.task1;

import Lesson8.task2.TextFormater;

import java.io.*;

public class Run {
    public static void main(String[] args) {

        try(BufferedWriter writ = new BufferedWriter(new FileWriter("src\\Lesson8\\task1\\Ishodniy"))){
          String se = "abba\n" + "tools\n"+ "tooloot\n" + "fdafdf\n" + "dfsddddd\n" + "ddddd\n" + "dgfdgdsgsdgsdg\n" + "gdsgsdgsd";
       writ.write(se);
        }
        catch (IOException e){
            System.out.println(e);
        }




        try(BufferedReader read = new BufferedReader(new FileReader("src\\Lesson8\\task1\\Ishodniy"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Lesson8\\task1\\task1.txt"))) {
            String  sd;
            while((sd = read.readLine()) != null){
               // if(sd.equals(TextFormater.getPalindrome(sd))){writer.write(sd); writer.newLine();}   // взял готовый метод из задания 2.
                if(sd.equals(new StringBuffer(sd).reverse().toString())){
                    writer.write(sd);
                    writer.newLine();
                }
            }
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
