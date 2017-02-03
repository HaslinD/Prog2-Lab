package haslindavila_.lab3;

import java.awt.Color;
import java.util.Date;

public class MorganAero8 extends Carros{
    private String convertible;
    private String tipoCabina;
    private int velocidadmax;
    private int kilometrosgal;
    private double preciovemta;

    public MorganAero8() {
        super();
    }

    public MorganAero8(String convertible, String tipoCabina, int velocidadmax, int kilometrosgal, double preciovemta, int nserie, Date ensamblado, Color pintura, String llantas, String polarizado, int velocidadMax, int kilometrosGal, double precio) {
        super(nserie, ensamblado, pintura, llantas, polarizado, velocidadMax, kilometrosGal, precio);
        this.convertible = convertible;
        this.tipoCabina = tipoCabina;
        this.velocidadmax = velocidadmax;
        this.kilometrosgal = kilometrosgal;
        this.preciovemta = preciovemta;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        if (velocidadmax >= 140 && velocidadmax <= 145) {
            this.velocidadmax = velocidadmax;
        }
    }

    public int getKilometrosgal() {
        return kilometrosgal;
    }

    public void setKilometrosgal(int kilometrosgal) {
        if (kilometrosgal >= 35 && kilometrosgal <= 40) {
            this.kilometrosgal = kilometrosgal;
        }
    }

    public double getPreciovemta() {
        return preciovemta;
    }

    public void setPreciovemta(double preciovemta) {
        if (preciovemta >= 500000 && preciovemta <= 700000) {
            this.preciovemta = preciovemta;
        }
    }

    @Override
    public String toString() {
        return "MorganAero8{" + "convertible=" + convertible + ", tipoCabina=" + tipoCabina + ", velocidadmax=" + velocidadmax + ", kilometrosgal=" + kilometrosgal + ", preciovemta=" + preciovemta + '}';
    }
    
    
}
