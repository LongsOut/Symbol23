package fes.aragon.modelo;

public class Racional {
    public int numerador;
    public int denominador;

    public Racional(){
        this.denominador=1;
        this.numerador=0;
    }

    public Racional(int numerador,int denominador){
    this.numerador=numerador;
    this.denominador=denominador;
    this.setDenominador(denominador);
    }

    public void setNumerador(int numerador){
        this.numerador=numerador;
    }

    public int getNumerador(){
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int denominador){
        if(denominador==0){
            this.denominador=1;
        }else{
            this.denominador=denominador;
        }
    }
}
