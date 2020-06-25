package java_testing;

public class DecimalABinario {

    public static void Binario(int decimal) {
        int binario[] = new int[40];
        int indice = 0;
        while(decimal > 0){
	    binario[indice++] = decimal%2;
            decimal = decimal/2;
	    }
        for(int i = indice -1; i>=0; i--){
            System.out.print(binario[i]);
        }
    }

}