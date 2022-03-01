package projectsoma;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author josue
 * Utilizando funções em um procedimento para somar dois valores, esse algoritmo
 * é bem simples mas contém boas informações no código.
 */
public class Projectsoma {

    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor1, valor2;
        System.out.println("Início de procedimento...");
        System.out.print("Informe o primeiro valor: ");
        valor1 = sc.nextDouble();
        System.out.print("Informe o segundo valor: ");
        valor2 = sc.nextDouble();

        double verifica = rotinaSoma(valor1, valor2);
        rotinaResultado(verifica);
        sc.close();
    }
    static double rotinaSoma(double v1, double v2) {
        double resultado;
        resultado = v1 + v2;
        return resultado;
    }
    static void rotinaResultado(double value) {
        System.out.println("O resultado dos valores: " + value);
    }
}
