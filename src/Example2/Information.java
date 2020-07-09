package Example2;

public class Information {
    public <T> void print(T[] items){
        for(T item : items){
            System.out.println(item);
        }
    }
}
