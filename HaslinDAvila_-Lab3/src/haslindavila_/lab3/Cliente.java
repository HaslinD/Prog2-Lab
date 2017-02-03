package haslindavila_.lab3;

import java.util.ArrayList;

public class Cliente extends Personas{
    private int dinero;
    private ArrayList<Carros> carro = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int dinero, String nombre, int id, int edad, double altura, int peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carros> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carros> carro) {
        this.carro = carro;
    }
    
    public void setCars(Carros car){
        carro.add(car);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + ", carro=" + carro + '}';
    }
    
    
}
