import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        double[] matematicas, historia, lenguaje;
        double totalMAtematicas = 0, totalHistoria = 0, totalLenguaje = 0;
        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas para matematicas:");
        for(int i = 0; i < matematicas.length; i++){
            matematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para historia:");
        for(int i = 0; i < historia.length; i++){
            historia[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para lenguaje:");
        for(int i = 0; i < lenguaje.length; i++){
            lenguaje[i] = s.nextDouble();
        }
        for(int i = 0; i < 7; i++){
            totalMAtematicas += matematicas[i];
            totalHistoria += historia[i];
            totalLenguaje += lenguaje[i];
        }
        System.out.println("Promedio clase matematicas "+ (totalMAtematicas/matematicas.length));
        System.out.println("Promedio clase historia "+ (totalHistoria/historia.length));
        System.out.println("Promedio clase lenguaje "+ (totalLenguaje/lenguaje.length));
    }
}
