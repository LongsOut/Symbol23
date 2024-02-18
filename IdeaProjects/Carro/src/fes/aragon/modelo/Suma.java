package fes.aragon.modelo;

public class Suma {
    public int sumando1;
    public int sumando2;

    public Suma(){
       this.sumando1=1;
       this.sumando2=0;
    }

    public Suma(int sumando1,int sumando2){
        this.sumando1=sumando1;
        this.sumando2=sumando2;
    }

    public void setSumando1(int sumando1){
        this.sumando1=sumando1;
    }

    public int getSumando(){
        return this.sumando1;
    }


    public int getSumando2(){
        return this.sumando2;
    }

    public void setSumando2(int sumando2){
        this.sumando2=sumando2;

    }


}
