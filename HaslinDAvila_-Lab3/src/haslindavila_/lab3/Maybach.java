package haslindavila_.lab3;

import java.awt.Color;
import java.util.Date;

public class Maybach extends Carros{
    private int llantasprov;
    private int velocidadmax;
    private int kilometrosgal;
    private double precioventa;

    public Maybach() {
        super();
    }
    
    public Maybach(int nserie, Date ensamblado, Color pintura, String llantas, String polarizado, int velocidadMax, int kilometrosGal, double precio) {
        super(nserie, ensamblado, pintura, llantas, polarizado, velocidadMax, kilometrosGal, precio);
        this.llantasprov = llantasprov;
        setPrecioventa(precioventa);
        setKilometrosgal(kilometrosgal);
        setVelocidadMax(velocidadmax);
    }

    public int getLlantasprov() {
        return llantasprov;
    }

    public void setLlantasprov(int llantasprov) {
        if (llantasprov == 1 || llantasprov == 2) {
            this.llantasprov = llantasprov;
        }
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        if (velocidadmax >= 155 && velocidadmax <= 160) {
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
        if (precioventa >= 400000 && precioventa <= 600000) {
            this.precioventa = precioventa;
        }
    }

    @Override
    public String toString() {
        return "Maybach{" + "llantasprov=" + llantasprov + ", velocidadmax=" + velocidadmax + ", kilometrosgal=" + kilometrosgal + ", precioventa=" + precioventa + '}';
    }
    
    
}
