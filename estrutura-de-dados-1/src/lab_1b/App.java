
import java.util.Scanner;

//Fontes: https://gasparbarancelli.com/post/removendo-acentuacoes-e-sinais-graficos-de-uma-string#:~:text=Em%20vers%C3%B5es%20do%20Java%207,remover%20somente%20acentos%20e%20gr%C3%A1ficos.&text=Para%20vers%C3%B5es%20do%20Java%20anteriores,removendo%20todos%20caracteres%20n%C3%A3o%20ASCII.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        try {
            pedirPalindromo(scanner);   
        } catch (Exception e) {
            System.out.println("Escreva corretamente");
            pedirPalindromo(scanner);
        }

    }

    private static Palindromo pedirPalindromo(Scanner scanner){
        String texto;
        Palindromo palindromo = new Palindromo();

        do{
            System.out.print("Texto: ");
            texto = scanner.nextLine();

            if(texto.equals("/sair")){
                break;
            }

            palindromo.setTexto(texto);
            System.out.println("É um palindromo: " + palindromo.verificar());   
        } while (!texto.equals("/sair"));
        return palindromo;         
    }

}
