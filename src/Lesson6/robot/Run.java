package Lesson6.robot;

import Lesson6.robot.hands.SamsungHand;
import Lesson6.robot.hands.SonyHand;
import Lesson6.robot.hands.ToshibaHand;
import Lesson6.robot.heads.SamsungHead;
import Lesson6.robot.heads.SonyHead;
import Lesson6.robot.heads.ToshibaHead;
import Lesson6.robot.legs.SamsungLeg;
import Lesson6.robot.legs.SonyLeg;
import Lesson6.robot.legs.ToshibaLeg;

public class Run {




    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHead sonyHead = new SonyHead(15);
        SamsungHead samsungHead = new SamsungHead(17);

        SonyLeg sonyLeg = new SonyLeg(25);
        ToshibaLeg toshibaLeg = new ToshibaLeg(24);

        ToshibaHand toshibaHand = new ToshibaHand(50);
        SonyHand sonyHand = new SonyHand(45);


        Robot robocop1 = new Robot(new ToshibaHead(12),new SamsungHand(39),new SamsungLeg(19));
        System.out.println("Новый робот Robocop, создан.");
        robocop1.action();
        System.out.println("Цена робота №1 составляет: " + robocop1.getPrice());

        System.out.println();

        Robot robocop2 = new Robot(sonyHead,toshibaHand,sonyLeg);
        System.out.println("Новый робот Robocop2, создан.");
       robocop2.action();
        System.out.println("Цена робота №2 составляет: " + robocop2.getPrice());

        System.out.println();

        Robot robocop3 = new Robot(samsungHead,sonyHand,toshibaLeg);

        System.out.println("Новый робот Robocop3, создан.");
        robocop3.action();
        System.out.println("Цена робота №3 составляет: " + robocop3.getPrice());



        System.out.println("***");
        if(robocop1.getPrice() > robocop2.getPrice() && robocop1.getPrice() > robocop3.getPrice()){
            System.out.println(" Робот №1 самый дорогой.");
        }
        else if(robocop2.getPrice() > robocop1.getPrice() && robocop2.getPrice() > robocop3.getPrice()){
            System.out.println("Робот №2 самый дорогой.");
        }
        else
            System.out.println("робот №3 самый дорогой.");


    }
}
