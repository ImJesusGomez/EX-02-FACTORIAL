package factorial;

import java.io.*;

public class Factorial {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        System.out.println("Dame un numero");
        int n = Integer.parseInt(teclado.readLine());
        
        System.out.println("El factorial de " + n + " es " + factorial(n));

    }

    public static int factorial(int n) {
        
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
