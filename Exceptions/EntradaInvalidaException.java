package Exceptions;

import java.util.InputMismatchException;

public class EntradaInvalidaException extends NumberFormatException{
    
    public EntradaInvalidaException(String message){
        super(message);
    }
}
