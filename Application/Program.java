package Application;

import java.util.Scanner;

import Entities.NumberGenerator;

public class Program {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        NumberGenerator numberGenerator = new NumberGenerator();


        System.out.println("Informe a quantidade de números que deseja gerar:");
        int qtd = dados.nextInt();

        numberGenerator.generateNumbers(qtd);


    }
}
