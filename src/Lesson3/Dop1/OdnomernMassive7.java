package Lesson3.Dop1;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class OdnomernMassive7 {
    public static void main(String[] args) throws IOException{
        int count = 0;
        int chislo = 8;
        int[] massive = new int[10];
        for(int a = 0; a < massive.length; a++){
            int r = (int) (Math.random() * 10);
            massive[a] = r;
            if(massive[a] == chislo){
                count++;
            }
        }
        if(count == 2 || count == 3 || count == 4){
        System.out.println("заданный эллемент встречается " + count + " раза");}
        else
            System.out.println("заданный эллемент встречается " + count + " раз");
        System.out.println(Arrays.toString(massive));
    }
}
