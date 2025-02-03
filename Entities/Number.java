package Entities;

public class Number implements Comparable<Number> {
    
    private int number;

    public Number(){

    }

    public Number(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int compareTo(Number o){
        return number - o.number;
    }


}
