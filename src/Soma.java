import java.util.Scanner;

// 3 - Faça um Programa que peça dois números e imprima a soma.

public class Soma {
    public static void main(String[] args) {
        int numero1, numero2, soma; //Declarando variáveis.
        Scanner userInput = new Scanner(System.in); //Definindo Scanner como userInput

        // Input e soma dos 2 números.
        System.out.println("Digite o primeiro número: ");
        numero1 = userInput.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = userInput.nextInt();
        soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);
    }
}