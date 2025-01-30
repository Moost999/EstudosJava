// FUNÇOES MATEMATICAS EM JAVA JDK 21
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  // Funções Matematicas em Java

    // A = Math.sqrt(x); | Significado Variavel A recebe o valor da raiz quadrada de X
    // A = Math.pow(x,y); | Significado Variavel A recebe o valor de X elevado a Y (Potencia)
    // A = Math.abs(x); | Significado Variavel A recebe o valor absoluto de X 
    
    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
    
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);
    
    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);
    
    System.out.println(x + " elevado a " + y + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado = " + C);
    
    A = Math.abs(y);
    B = Math.abs(z);
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);
  }
}
