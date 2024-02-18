package fes.aragon.inicio;

import fes.aragon.modelo.Racional;
import fes.aragon.modelo.Suma;

public class Principal2 {
    public static void main(String[] args) {
        Racional r1=new Racional(2,3);
        Racional r2=new Racional(1,0);
        System.out.println(r2.getDenominador());
        int numerador= r1.getNumerador()*r2.getDenominador()+
                r2.getNumerador()* r1.getDenominador();
        int denominador=r1.getDenominador()* r2.getDenominador();
        System.out.println(numerador + "/" +denominador);

        Suma s1=new Suma(1,7);
        System.out.println(s1.getSumando());
        int suma=s1.getSumando()+s1.getSumando2();
        System.out.println(suma );
    }
}
