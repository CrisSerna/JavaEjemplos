package serna.alan.pooexcepciones;

import java.util.Scanner;

public class Calculadora {

    public static double aplicarDividir(int numerador, int divisor) throws DivisionZeroException{
        if(divisor == 0){
            throw new DivisionZeroException("no se puede dividir por cero");
        }
        return numerador/divisor;
    }

    public static double dividir(String numerador, String divisor)
            throws DivisionZeroException, FormatoNumeroException {
        try{
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return aplicarDividir(num, div);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un número enn el numerador y divisor");
        }

    }
}
