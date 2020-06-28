package Lesson5;

import java.io.IOException;

public class AirMilitary extends Air{
    private boolean catapult;
    private int countRocket;
   AirMilitary(){}
    AirMilitary(String brand,int power, int maxSpeed, int weight, float sizeWings,int runawayLength,boolean catapult, int countRocket ) {
        this.setBrand(brand);
        this.setPower(power);
        this.setMaxSpeed(maxSpeed);
        this.setWeight(weight);
        this.setSizeWings(sizeWings);
        this.setRunawayLength(runawayLength);
        this.setCatapult(catapult);
        this.setCountRocket(countRocket);
    }

    public void setCatapult(boolean catapult){ this.catapult = catapult; }
    public boolean getCatapult(){ return catapult; }

    public void setCountRocket(int countRocket){ this.countRocket = countRocket; }
    public int getCountRocket(){ return countRocket; }

    public void shoot() {
        if(getCountRocket() > 0){
            System.out.println("Ракета пошла!");
        }
        else {
            System.out.println("Ракеты отсутствуют.");
        }
    }
    public void catapult () {
        if(catapult == true){
            System.out.println("Катапультирование прошло успешно.");
        }
        else {
            System.out.println("У вас нет такой системы.");
        }
    }

    public void descriptionAirMilitary(){
        System.out.println(descriptionAir() + ", наличие катапульты " + catapult + ", количество ракет: " + countRocket + ".");
        System.out.println("Мощность в Kwt: " + getKwt());
    }

    public static void main(String[] args) throws IOException {
       AirMilitary ff = new AirMilitary();
       ff.setBrand("ТУ154");
       ff.setCountRocket(5);
       ff.setCatapult(true);
       ff.setMaxSpeed(1800);
       ff.setWeight(900);
       ff.setPower(2000);
       ff.setRunawayLength(500);
       ff.setSizeWings(30);
       ff.descriptionAirMilitary();
       ff.shoot();
       ff.catapult();

       AirMilitary ff150 = new AirMilitary("TY160",2000,1800,1360,(float)15.4,230,false,0);
       ff150.descriptionAirMilitary();
       ff150.catapult();
       ff150.shoot();
    }
}
