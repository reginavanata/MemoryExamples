import java.util.Scanner;

public class MemoryStack {

    public static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recurse();
    }

    //recursive method - infinite recursion
    public static void recurse(){
        count++;
        System.out.println(count);
        recurse();
    }
}
