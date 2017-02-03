package haslindavila_.lab3;

import java.awt.Color;
import java.util.Date;

public class FiskerAutomotive extends Carros{
    private String tipoestilo;
    private String convertible;
    private int velocidadmax;
    private int kilometrosgal;
    private double precioventa;

    public FiskerAutomotive() {
        super();
    }

    public FiskerAutomotive(String tipoestilo, String convertible, int velocidadmax, int kilometrosgal, double precioventa, int nserie, Date ensamblado, Color pintura, String llantas, String polarizado, int velocidadMax, int kilometrosGal, double precio) {
        super(nserie, ensamblado, pintura, llantas, polarizado, velocidadMax, kilometrosGal, precio);
        this.tipoestilo = tipoestilo;
        this.convertible = convertible;
        this.velocidadmax = velocidadmax;
        this.kilometrosgal = kilometrosgal;
        this.precioventa = precioventa;
    }

    public String getTipoestilo() {
        return tipoestilo;
    }

    public void setTipoestilo(String tipoestilo) {
        this.tipoestilo = tipoestilo;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        if (velocidadmax >= 160 && velocidadmax <= 165) {
            this.velocidadmax = velocidadmax;
        }
    }

    public int getKilometrosgal() {
        return kilometrosgal;
    }

    public void setKilometrosgal(int kilometrosgal) {
        if (kilometrosgal >= 55 && kilometrosgal <= 60) {
            this.kilometrosgal = kilometrosgal;
        }
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        if (precioventa >= 450000 && precioventa <= 650000) {
            this.precioventa = precioventa;
        }
    }

    @Override
    public String toString() {
        return "FiskerAutomotive{" + "tipoestilo=" + tipoestilo + ", convertible=" + convertible + ", velocidadmax=" + velocidadmax + ", kilometrosgal=" + kilometrosgal + ", precioventa=" + precioventa + '}';
    }
    
}
