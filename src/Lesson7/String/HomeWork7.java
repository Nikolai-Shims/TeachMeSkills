package Lesson7.String;

public class HomeWork7 {
    public static void main(String[] args) {
        //"Вырезать подстроку из строки начиная с первого вхождения символа(А) до,последнего вхождения сивола(B)
       //Задание 1.
        StringBuffer buf = new StringBuffer("Hello big world");
        System.out.println(buf);
        buf.delete(buf.indexOf("big"),10);
        System.out.println(buf);
        System.out.println("*******************************");


        //задание 2.
        String str2 = "Fаменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0.";
        System.out.println( str2);
        char d = str2.charAt(3);
        char f = str2.charAt(0);
        char[] massivstr2 = str2.toCharArray();
        for(int a = 0; a < massivstr2.length; a++){
            if(massivstr2[a] == d){
                massivstr2[a] = f;
            }
        }
        String str2new = String.valueOf(massivstr2);
        System.out.println(str2new);
        System.out.println("********************************");


        //задание 3.
        String str3 = "Задача: найти, в строке не только запятые, но и другие знаки препинания!? - Подсчитать общее их количество..";
        int count = 0;
        System.out.println(str3);
        char[] massiv = str3.toCharArray();
        char[] massiv2 = new char[]{'!','$','&','.','@','"','?',',',':',';','-'};
        for(int a = 0; a < massiv.length; a++){
            for(int b = 0; b < massiv2.length; b++){
               if(massiv[a] == massiv2[b]){
                   count++;
               }
            }
        }
        System.out.println("всего " + count + " знаков препинания.");
        System.out.println("**************************************");


        //задание 4.
        //Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
        String str4 = "Привет, большой и огромный мир..!";
        System.out.println(str4);
        String s4 = str4.replaceAll("[,.!?]", " ");
        String[]task4 = s4.trim().split(" +");
        String[] t4 = new String[task4.length];
        for(int a = 0; a < task4.length; a++){
            t4[a] = String.valueOf(task4[a].charAt(task4[a].length()-1));
        }
        String lasresult = String.join("", t4);
        System.out.println(lasresult);

    }
}

