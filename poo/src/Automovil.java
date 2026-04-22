public class Automovil {
    String fabricante;
    String modelo;
    String color;
    double cilindros;

    public void muestraFabricante(){
        System.out.println(this.fabricante);
    }

    public String verDetalle(){
        return "fabricante automovil"+this.fabricante;
    }

    public String acelerar(int revoluciones){
        return "El carro acelera a "+revoluciones;
    }
}
