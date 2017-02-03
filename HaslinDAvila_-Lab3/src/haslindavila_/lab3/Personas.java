package haslindavila_.lab3;

public class Personas {
    private String nombre;
    private int id;
    private int edad;
    private double altura;
    private int peso;

    public Personas() {
    }
    
    public Personas(String nombre, int id, int edad, double altura, int peso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 1.55) {
            this.altura = altura;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso >= 120) {
            this.peso = peso;
        }
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
}
