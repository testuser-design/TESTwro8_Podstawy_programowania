import java.util.Scanner;

public class Calculation {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        short b = (short) a;
        double c = a - b;
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String cString = String.valueOf(c);
        String message = "Wynik %a - %b = %c"
                .replace("%a", aString)
                .replace("%b", bString)
                .replace("%c", cString);
        System.out.println(message);
    }
}
