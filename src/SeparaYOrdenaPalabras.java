import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SeparaYOrdenaPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        List<String> palabras = Arrays.asList(frase.split(" "));
        palabras.sort(Comparator.comparing(String::toLowerCase));

        System.out.println("Palabras ordenadas: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
