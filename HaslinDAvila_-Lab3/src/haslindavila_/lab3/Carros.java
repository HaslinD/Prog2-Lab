package haslindavila_.lab3;

import java.awt.Color;
import java.util.Date;

public class Carros {
    private int nserie;
    private Date ensamblado;
    private Color pintura;
    private String llantas;
    private String polarizado;
    private int velocidadMax;
    private int kilometrosGal;
    private double precio;

    public Carros() {
    }

    public Carros(int nserie, Date ensamblado, Color pintura, String llantas, String polarizado, int velocidadMax, int kilometrosGal, double precio) {
        this.nserie = nserie;
        this.ensamblado = ensamblado;
        this.pintura = pintura;
        this.llantas = llantas;
        this.polarizado = polarizado;
        this.velocidadMax = velocidadMax;
        this.kilometrosGal = kilometrosGal;
        this.precio = precio;
    }

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
        this.nserie = nserie;
    }

    public Date getEnsamblado() {
        return ensamblado;
    }

    public void setEnsamblado(Date ensamblado) {
        this.ensamblado = ensamblado;
    }

    public Color getPintura() {
        return pintura;
    }

    public void setPintura(Color pintura) {
        this.pintura = pintura;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getKilometrosGal() {
        return kilometrosGal;
    }

    public void setKilometrosGal(int kilometrosGal) {
        this.kilometrosGal = kilometrosGal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carros{" + "nserie=" + nserie + ", ensamblado=" + ensamblado + ", pintura=" + pintura + ", llantas=" + llantas + ", polarizado=" + polarizado + ", velocidadMax=" + velocidadMax + ", kilometrosGal=" + kilometrosGal + ", precio=" + precio + '}';
    }

    
    
    
}
