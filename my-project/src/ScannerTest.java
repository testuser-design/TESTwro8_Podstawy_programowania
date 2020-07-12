import java.util.Scanner;

public class ScannerTest {
    public static void main(String... args) {
        System.out.println("Witaj w programie");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string = scanner.next();
        System.out.println("Podaj pozycję znaku");
        int index = scanner.nextInt();


        System.out.println("Znak na pozycji {} "
                .replace("{}",
                        String.valueOf(index))
                + ((string.length() > index) ? " to "
                + string.charAt(index) : " nie istnieje"));
    }
}

