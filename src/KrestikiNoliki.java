import java.io.IOException;
import java.util.Scanner;

public class KrestikiNoliki {
    static int count = 9;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        boolean check = true;

        String x ="x";
        String o = "o";
        String [][] place = new String[5][5];


        for(int f = 1; f < place.length-1; f++){
            for(int g = 1; g < place[0].length-1; g++){
                place[f] [g] = "-"; } }
        place[0][0] = "y";  place[4][1] = "1";
        place[0][1] = " ";  place[4][2] = "2";
        place[0][4] = " ";  place[4][3] = "3";
        place[0][3] = " ";  place[4][4] = "x";                     //// заполняем рабочий массив.
        place[0][2] = " ";

        place[1][0] = "1";  place[1][4] = " ";
        place[2][0] = "2";  place[2][4] = " ";
        place[3][0] = "3";  place[3][4] = " ";
        place[4][0] = " ";







        while (check) {
            for (int a = 0; a < place.length; a++) {
                for (int b = 0; b < place[0].length; b++) {               // отрисовываем поле после каждого хода.
                    System.out.print(place[a][b] + " "); }
                System.out.println(); }

            System.out.println("Введите координаты по оси Y: ");
            int stroka = scan.nextInt();
            System.out.println("Введите координаты по оси X: ");
            int stolbec = scan.nextInt();
            System.out.println("введите значение: X, или O.");
            String znachenie = scan2.nextLine();
            place[stroka][stolbec] = znachenie;
            count--;



            if(count == 0){
                check = false;
                System.out.println("Ничья, победила дружба.");
            }


            if(place[1][1].equals(x) && place[1][2].equals(x) && place [1][3].equals(x) || place[2][1].equals(x) && place[2][2].equals(x) && place[2][3].equals(x) || place[3][1].equals(x) && place[3][2].equals(x) && place[3][3].equals(x)){
                System.out.println("Игрок Х победил.");
                check = false;                                            //проверка для победы x
                break; }

            else if (place[1][1].equals(o) && place[1][2].equals(o) && place [1][3].equals(o) || place[2][1].equals(o) && place[2][2].equals(o) && place[2][3].equals(o) || place[3][1].equals(o) && place[3][2].equals(o) && place[3][3].equals(o)){
                System.out.println("игрок О победил");
                check = false;
                break;
            }


        }

    }

}


