
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int absolute = num * (-1);
        if(num >= 0){
            System.out.println(num);
        } else {
            System.out.println(absolute);
        }
    }
}