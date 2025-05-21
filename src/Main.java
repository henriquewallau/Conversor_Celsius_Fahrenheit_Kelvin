import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor em Celsius: ");
        double celsius = sc.nextInt();

        double convertFahr = (celsius * 1.8) + 32;
        double convertKel = celsius + 273.15;

        System.out.printf("Fahrenheit: %.1f\n" , convertFahr);
        System.out.printf("Kelvin: %.2f\n" , convertKel);

        sc.close();
    }
}
