package java_testing;
//import java.util.
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int valorDecimal = 1023;
        DecimalABinario db = new DecimalABinario();
        
        System.out.print("Numero en decimal:\n\t");
        System.out.print(valorDecimal);
        System.out.print("\nNumero en binario:\n\t");
        db.Binario(valorDecimal);
    }

}
