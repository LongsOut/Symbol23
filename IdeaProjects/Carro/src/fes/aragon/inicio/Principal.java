package fes.aragon.inicio;

import fes.aragon.modelo.Bicicleta;
import fes.aragon.modelo.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro objeto = new Carro();
        System.out.println(objeto.getColor());
        objeto.setColor("naranja");
        System.out.println(objeto.getColor());

        Bicicleta objeto1=new Bicicleta();
        System.out.println(objeto1.getModelo());
        objeto1.setModelo("trafico");
        System.out.println(objeto1.getModelo());
    }
}

