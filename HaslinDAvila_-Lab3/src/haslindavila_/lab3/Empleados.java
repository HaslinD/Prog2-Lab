package haslindavila_.lab3;

public class Empleados extends Personas{
    private String horastrabajo;
    private Cliente cliente;

    public Empleados() {
        super();
    }

    public Empleados(String horastrabajo, Cliente cliente, String nombre, int id, int edad, double altura, int peso) {
        super(nombre, id, edad, altura, peso);
        this.horastrabajo = horastrabajo;
        this.cliente = cliente;
    }

    public String getHorastrabajo() {
        return horastrabajo;
    }

    public void setHorastrabajo(String horastrabajo) {
        this.horastrabajo = horastrabajo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Empleados{" + "horastrabajo=" + horastrabajo + ", cliente=" + cliente + '}';
    }
    
    
}
