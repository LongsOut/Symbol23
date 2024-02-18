package fes.aragon.modelo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Carro{
    private int velocidad;
    private int kilometraje;
    private double aceleracion;
    private String marca;
    private String color;
    //constructor vacio que despues se definira con argumentos
    public Carro(){
        this.color="amarillo";
        this.marca="vocho";
        this.aceleracion=5.5;
        this.kilometraje=98;
        this.velocidad=60;
    }
    //constructor con argumentos
    public Carro(String marca,String color,int velocidad,int kilometraje, double aceleracion){
        this.color=color;
        this.marca=marca;
        this.velocidad=velocidad;
        this.kilometraje=kilometraje;
        this.aceleracion=aceleracion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
