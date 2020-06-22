package Lesson2;

public class HomeWork8 {
    public static void main(String[] args) {
        for (int a = 4; a > 0; a--) {

            for(int h = 0; h < a-1; h++){
              System.out.print("  ");
            }

            for (int b = 5; b > a; b--) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        System.out.println();
        System.out.println();

        for(int e = 0; e < 4; e++){
            for(int s = 0; s < e; s++){
                System.out.print("  ");
            }
            for(int d = 4; d > e; d--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
