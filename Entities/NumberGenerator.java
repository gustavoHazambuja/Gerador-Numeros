package Entities;

import java.util.HashSet;
import java.util.Set;

public class NumberGenerator {
    
    private Set<Number> numbers;
    private Integer randomNumber;

    public NumberGenerator(){
        this.numbers = new HashSet<Number>();
    }


    public void generateNumbers(int qtd){
       while(numbers.size() < qtd){
        randomNumber = (int) (Math.random() * 60) + 1;
            numbers.add(new Number(randomNumber));
       }
       
    }

    public void displayNumbers(){
        if(numbers.isEmpty()){
            System.out.println("Nenhum número gerado");
        }
        for(Number n: numbers){
            System.out.println(n);
        }
    }
}
