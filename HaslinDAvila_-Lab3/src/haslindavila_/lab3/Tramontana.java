package haslindavila_.lab3;

import java.awt.Color;
import java.util.Date;

public class Tramontana extends Carros{
    private int peso;
    private int transmision;
    private int velocidadmax;
    private int kilometrosgal;
    private double precioventa;

    public Tramontana() {
        super();
    }

    public Tramontana(int peso, int transmision, int velocidadmax, int kilometrosgal, double precioventa, int nserie, Date ensamblado, Color pintura, String llantas, String polarizado, int velocidadMax, int kilometrosGal, double precio) {
        super(nserie, ensamblado, pintura, llantas, polarizado, velocidadMax, kilometrosGal, precio);
        this.peso = peso;
        this.transmision = transmision;
        this.velocidadmax = velocidadmax;
        this.kilometrosgal = kilometrosgal;
        this.precioventa = precioventa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso >= 1276 && peso <= 1376) {
            this.peso = peso;
        }
    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        if (transmision == 6 || transmision == 7) {
            this.transmision = transmision;
        }
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        if (velocidadmax >= 175 && velocidadmax <= 180) {
            this.velocidadmax = velocidadmax;
        }
    }

    public int getKilometrosgal() {
        return kilometrosgal;
    }

    public void setKilometrosgal(int kilometrosgal) {
        if (kilometrosgal >= 50 && kilometrosgal <= 55) {
            this.kilometrosgal = kilometrosgal;
        }
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        if (precioventa >= 800000 && precioventa <= 1000000) {
            this.precioventa = precioventa;
        }
    }

    @Override
    public String toString() {
        return "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + ", velocidadmax=" + velocidadmax + ", kilometrosgal=" + kilometrosgal + ", precioventa=" + precioventa + '}';
    }
    
}
