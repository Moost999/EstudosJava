USANDO O REPLIT PARA ESTUDOS.
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String texto = sc.next();
    System.out.println("Voce digitou " + texto);
  
    int a = sc.nextInt(); // Le inteiros
    System.out.println("Voce Digitou " +  a);

    double x = sc.nextDouble(); // Le doubles
    System.out.printf("voce digitou:  %.2f%n" , x); // Imprime com duas casas decimais

    
    char chars = sc.next().charAt(0); // Le um caractere
    System.out.println(chars);
    sc.close();
  }

}
