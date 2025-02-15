package lab_aquecimento;

import java.util.Scanner;

// Escreva um programa que imprime "Bem-vindo à disciplina de Estrutura de Dados!". Depois, modifique para pedir o nome do aluno e
//imprimir "Bem-vindo, [nome]!".

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo à disciplina Estrutura de Dados");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bem-vindo, " + nome + ".");
        scanner.close();
    }
}
