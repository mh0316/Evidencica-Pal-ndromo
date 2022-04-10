import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String cadena = leer.nextLine();

        boolean esPalindromo = true;
        for(int i=0;i<cadena.length()/2;i++){
            if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)){
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo){
            System.out.println("La palabra es palíndromo");
        }else{
            System.out.println("La palabra no es palíndromo");
        }
    }
}
