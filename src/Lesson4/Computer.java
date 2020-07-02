package Lesson4;

import java.util.Scanner;

public class Computer {

    private String processor;
    private int ddr;
    private int ssd;

    int resyrsCompa = 3;

    Computer(String processor, int ddr, int ssd) {
        this.processor = processor;
        this.ddr = ddr;
        this.ssd = ssd;
    }


    public void characteristics() throws Exception {
        System.out.println("*");
        System.out.println("процессор - " + processor);
        System.out.println("Оперативная память DDR на " + ddr + " Gb.");
        System.out.println("Жесткий диск на " + ssd + " Gb.");
        System.out.println("ресурс компьютера:  " + resyrsCompa);
        System.out.println("*");
        System.out.println();
    }


    public void on () throws Exception {
        int sboi = 1;
        boolean b = false;
        Scanner scan = new Scanner(System.in);
        while (resyrsCompa > 0) {
            while (b != true) {
                System.out.println("*");
                System.out.println("Включение компьютера.");
                Thread.sleep(1000);
                if (sboi == (int)(Math.random()*2)) {
                    System.out.println("#####  Произошел сбой  #####");
                    Thread.sleep(1000);
                    System.out.println("Выберите действие \"0\" или \"1\" ");
                    int password = scan.nextInt();
                    int pass = (int) (Math.random() * 2);
                    if (password == pass) {
                        System.out.println("/Компьютер выключен/");
                        resyrsCompa--;
                    } else {
                        System.out.println("Действие выбрано не верное, процессор " + processor + " сгорел...");
                        resyrsCompa = 0;
                        break;
                    }
                } else {
                    b = true;
                    System.out.println("Компьютер, успешно включен!");
                    System.out.println("*");
                    resyrsCompa--;
                }
            }

            if(resyrsCompa == 0){

                System.out.println();
                Thread.sleep(1000);
                System.out.println( "Ресурс компьютера вышел, он не работает..");
                System.out.println();
            }
            else if (b = true){
                break;
            }
        }
    }


    public void off () throws Exception{
        Scanner scan = new Scanner(System.in);
        int sboi = 1;
        boolean b = false;
        while (resyrsCompa > 0) {
            while (b != true) {
                System.out.println("*");
                System.out.println("Выключение компьютера.");
                Thread.sleep(1000);
                if (sboi == (int)(Math.random()* 2)) {
                    System.out.println("#####  Произошел сбой  #####");
                    Thread.sleep(1000);
                    System.out.println("Выберите действие \"0\" или \"1\" ");
                    int pass = (int) (Math.random() * 2);
                    System.out.println(pass);
                    int password = scan.nextInt();

                    if (password == pass) {
                        System.out.println("Компьютер не смог завершить работу.");
                        continue;
                    } else {
                        System.out.println("Действие выбрано не верное, процессор " + processor + " сгорел...");
                        resyrsCompa = 0;
                        break;
                    }
                }
                else {
                    b = true;
                    System.out.println("Компьютер, успешно выключен!");
                    System.out.println("*");
                    resyrsCompa--;
                }
            }
            if(resyrsCompa == 0){
                System.out.println();
                Thread.sleep(1000);
                System.out.println( "Ресурс компьютера вышел, он не работает..");
                System.out.println();
            }
            else if (b = true){
                break;
            }
        }
    }
}


