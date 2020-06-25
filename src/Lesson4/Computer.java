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
        Thread.sleep(1000);
        System.out.println("процессор - " + processor);
        Thread.sleep(1000);
        System.out.println("Оперативная память DDR на " + ddr + " Gb.");
        Thread.sleep(1000);
        System.out.println("Жесткий диск на " + ssd + " Gb.");
        Thread.sleep(1000);
        System.out.println("ресурс компьютера:  " + resyrsCompa);
        Thread.sleep(1000);
        System.out.println("*");
        System.out.println();
    }


    public void on () throws Exception {
        Scanner scan = new Scanner(System.in);
        int sboi = 1;
        int random = (int) (Math.random() * 2);
        boolean b = false;

        while (resyrsCompa > 0) {

            while (b != true) {
                System.out.println("*");
                System.out.println("Включение компьютера.");
                Thread.sleep(1000);
                if (sboi == random) {
                    System.out.println("#####  Произошел сбой  #####");
                    Thread.sleep(1000);
                    System.out.println("Выберите действие \"0\" или \"1\" ");
                    int password = scan.nextInt();
                    int pass = (int) (Math.random() * 2);

                    if (password == pass) {
                        off();
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
        while(resyrsCompa > 0) {
            Thread.sleep(1000);
            System.out.println("*");
            System.out.println("Выключение компьютера.");
            Thread.sleep(1000);
            resyrsCompa--;
            System.out.println("off");
            System.out.println("*");
            break;
        }
    }
//public String speak(int random, int scanValue){
  //      return random, scanValue;
//}
}

