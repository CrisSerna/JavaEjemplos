package serna.alan.pooexcepciones;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) throws DivisionZeroException{

        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el numedador");
            String num = s.next();
            System.out.println("Ingrese el divior");
            String div = s.next();
            double division = Calculadora.dividir(num, div);
            System.out.println("Resultado "+division);
        }
        catch(NumberFormatException ne){
            System.out.println("Ingrese un valor numerico"+ ne.getMessage());
        }
        catch(DivisionZeroException ae){
            System.out.println("Problema aritmetico"+ ae.getMessage());
        }
        catch(FormatoNumeroException e){
            System.out.println("Ingrese numero valido"+ e.getMessage());
        }
        finally{
            System.out.println("Siempre se ejecuta");
        }

        System.out.println("Continua con la aplicación");


    }
}
