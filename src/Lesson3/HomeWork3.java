package Lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        int [] massive = new int[15];
        int count = 0;
        for(int a = 0; a < massive.length; a++){
            massive[a] = (int) (Math.random() * 99);
            if(massive[a] % 2 == 0){
                count++;
            }
        }
        System.out.println("Колличество четных эллементов в массиве = " + count);
        System.out.println(Arrays.toString(massive));

    }
}
