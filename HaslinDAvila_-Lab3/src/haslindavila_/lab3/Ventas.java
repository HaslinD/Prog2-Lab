package haslindavila_.lab3;

public class Ventas {
    private Empleados empleado;
    private Cliente cliente;
    private Carros carro;

    public Ventas() {
    }

    public Ventas(Empleados empleado, Cliente cliente, Carros carro) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.carro = carro;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Ventas{" + "empleado=" + empleado + ", cliente=" + cliente + ", carro=" + carro + '}';
    }
    
    
}
