package Lesson6.cosmos;

public class Shuttle implements IStart{
    private String name;
    public boolean a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shuttle(String name){
    boolean a = true;
    this.name = name;
    }

    @Override
    public boolean checkSistem() {
        int random = (int)(Math.random()*10);

        if(random > 3){
            a = true;
            System.out.println("Проверка Shuttle прошла успешно!");
        }
        else {
            a = false;
        }

        return a;
    }



    @Override
    public void startEngine() {

        if (a == true) {
            for (int as = 10; as > 0; as--) {
                System.out.println(as); }
            System.out.println("Двигатели шатла запущены, все системы в норме.");}
        else{
            System.out.println("Проверка не пройдена.");
        }
    }


    @Override
    public void startStart() {
        if(a == true) {
            System.out.println("Старт шатла.."); }
    else
            System.out.println();
    }

}
