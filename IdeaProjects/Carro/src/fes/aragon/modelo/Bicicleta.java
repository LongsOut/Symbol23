package fes.aragon.modelo;

public class Bicicleta {
    private String modelo;
    private String color;
    private String tipo;
    private int velocidad;
    private int fabricacion;
    public Bicicleta(){
        this.modelo="montaña";
        this.tipo="benotto";
        this.color="blanca";
        this.velocidad=15;
        this.fabricacion=2020;

    }
    public Bicicleta(String color,String tipo,String modelo,int velocidad,int fabricacion){
        this.velocidad=velocidad;
        this.fabricacion=fabricacion;
        this.tipo=tipo;
        this.color=color;
        this.modelo=modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }
}
