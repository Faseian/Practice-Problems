package Chapter_22;

public class Problem1 {
    public static void main(String[] args){
        char i = 'a';
        int j = Character.valueOf(i).compareTo('b');
        if (j < 0) {
            System.out.println("Nice");
        }
    }
}
