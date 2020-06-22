package Lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HomeWork9 {
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(scan.readLine());
        int half1 = 0;
        int half2 = 0;
        if(a > 0){
            int [] massive = new int[a];
            for(int x = 0; x < massive.length; x++){
                int chislo = (int)(Math.random() * 15);
                massive[x] = chislo;
                System.out.print(massive[x] + " ");
            }

            int polovina = massive.length / 2;

            for(int z = 0; z < polovina; z++){
                half1 += massive[z];
            }
           for(int r = polovina; r < massive.length; r++ ){
               half2 += massive[r];
           }
        }
        else{
            System.out.println("введено неправильное число");
        }
        System.out.println();
        if(half1 > half2){
            System.out.println("сумма первой половины больше");
        }
        else if(half1 < half2 ){
            System.out.println("сумма второй половины больше");
        }
        else
            System.out.println("половины равны");
        //System.out.println(half1);
        //System.out.println(half2);

    }
}
