package lab_1a;
import java.util.Scanner;

//Escreva um método estático mulComAdicao() que recebe dois números como
//parâmetros. O primeiro parâmetro é um número real e o segundo parâmetro um
//número inteiro. A função deve retornar a multiplicação entre os parâmetros,
//porém, a multiplicação deve ser feita usando apenas a operação de adição.

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double real = scanner.nextDouble();
        int inteiro = scanner.nextInt();

        double multiplicacao = mulComAdicao(real, inteiro);

        System.out.println(multiplicacao);

        scanner.close();
    }

    public static double mulComAdicao(double real, int inteiro){
        double adicao = real;

        for(int i = 1; i < inteiro; i++){
            adicao+= real;
        }

        return adicao;
    }
}