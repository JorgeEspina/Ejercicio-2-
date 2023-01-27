import java.util.Scanner;

public class Main {
    public static String IsPalindromo(String CadenaIngresada, String CadenaInvertida){
        if(CadenaIngresada.equals(CadenaInvertida)){
            return "Es Palindromo";
        }
        return "No es Palindromo";
    }
    public static void main(String[] args) {
        String CadenaIngresada = "";
        String CadenaInvertida = "";
        char Caracter;
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------------");

        System.out.print("Ingrese una Cadena u palabra \n");
        CadenaIngresada = s.next().toLowerCase();
        int contador = CadenaIngresada.length()-1;
        while ( contador >= 0){
            Caracter = CadenaIngresada.charAt(contador);
            CadenaInvertida += Caracter;
            contador--;
        }
        System.out.println(IsPalindromo(CadenaIngresada,CadenaInvertida));
        System.out.println("--------------------------");
    }
}