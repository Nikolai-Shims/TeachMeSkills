package Lesson6.cosmos;

public class SpaceX implements IStart{
   private  boolean a;
    private String name;

    public SpaceX(){
        this.name = "SpaceX";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    @Override
    public boolean checkSistem() {
        int random = (int)(Math.random()*10);

        if(random > 3){
            a = true;
            System.out.println("Проверка SpaceX прошла успешно!");
        }
        else {
            a = false;
            //System.out.println("Предстартовая проверка провалилась.");
            }

        return a;

    }
    @Override
    public void startEngine() { if (a == true) {
        for (int as = 10; as > 0; as--) {
            System.out.println(as); }
        System.out.println("Двигатели SpaceX запущены, все системы в норме.");}
    else{
        System.out.println("Проверка не пройдена.");
    }

    }
    @Override
    public void startStart() {
        if(a == true) {
            System.out.println("SpaceX взлетел"); }
        else
            System.out.println();
    }



}
