import java.util.Scanner;
public class firs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(x+y);
        }
    }
}
