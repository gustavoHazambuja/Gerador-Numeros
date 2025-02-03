package Application;

import java.util.Scanner;

import Entities.NumberGenerator;
import Exceptions.EntradaInvalidaException;
import Exceptions.numberException;

public class Program {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int qtd = -1;
        boolean isValidated = true;

        NumberGenerator numberGenerator = new NumberGenerator();

        do{

        System.out.println("Informe a quantidade de números que deseja gerar:(0 a 60)");

        try{
            String entrada = dados.nextLine();

            qtd = Integer.parseInt(entrada);

            if ((qtd < 0 || qtd > 60)) {
                throw new numberException("Número fora do intervalo (0 a 60).");
            }
            isValidated = false;
            
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("Entrada inválida. Digite apenas números.");
        } catch (numberException e) { 
            System.out.println(e.getMessage());
        }
        
        
    
        if(qtd >= 0 && qtd <= 60){
            numberGenerator.generateNumbers(qtd);
            numberGenerator.displayNumbers();
        }
       
    }while(isValidated);

    }
}
