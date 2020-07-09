package Lesson8.task2;

public class TextFormater {

    public static int countWords(String string){
        string = string.replaceAll("[,.!?><:;]", " ");
        String[] massive = string.trim().split(" +");
        return massive.length;
    }

    public static boolean getPalindrome(String string) {
        string = string.replaceAll("[,.!?><:;]", " ");
        String[] str = string.trim().split(" +");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(new StringBuffer(str[i]).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
