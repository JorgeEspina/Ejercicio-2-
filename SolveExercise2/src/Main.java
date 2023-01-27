import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String CadenaIngresada = "";
        String CadenaInvertida = "";
        char Caracter;
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1. Ingresar Cadena o Palabra");
            System.out.println("2. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = s.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("--------------------------");

                    System.out.println("Ingrese una Cadena u palabra ");
                    CadenaIngresada = s.next().toLowerCase();
                    int contador = CadenaIngresada.length()-1;
                    while ( contador >= 0){
                        Caracter = CadenaIngresada.charAt(contador);
                        CadenaInvertida += Caracter;
                        contador--;
                    }
                    if(CadenaIngresada.equals(CadenaInvertida)){
                        System.out.println("Es Palindromo");
                    }else{
                        System.out.println("No es Palindromo");
                    }
                    CadenaInvertida = "";
                    CadenaIngresada = "";
                    System.out.println("--------------------------");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros entre 1 y 2");
            }
        }





    }

}