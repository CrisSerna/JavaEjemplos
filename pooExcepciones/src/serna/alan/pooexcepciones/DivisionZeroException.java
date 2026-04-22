package serna.alan.pooexcepciones;

public class DivisionZeroException extends RuntimeException {
    public DivisionZeroException(String mensaje){
        super(mensaje);
    }
}