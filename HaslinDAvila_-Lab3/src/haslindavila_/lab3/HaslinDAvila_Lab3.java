package haslindavila_.lab3;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HaslinDAvila_Lab3 {
    private static int nserie;
    private static String fechaensamblado;
    private static Color colorpintura;
    private static String marcallantas;
    private static int llantas;
    private static String polarizado;
    private static int velocidadmax;
    private static int kilometrosgal;
    private static double precioventa;
    private static DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    private static String convertible;
    private static String tipocabina;
    private static String tipoestilo;
    private static int peso;
    private static int transmision;
    private static String nombre;
    private static int id;
    private static int edad;
    private static double altura;
    private static int pesop;
    private static String horastrabajo;
    private static int dinero;
    public static void main(String[] args) throws ParseException {
        Cliente cl = new Cliente();
        ArrayList<Carros> carros = new ArrayList();
        ArrayList<Personas> personas = new ArrayList();
        int opcion = 0;
        do {
            String MenuP = "--MENU--\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Ventas\n"
                    + "5. Reporte\n"
                    + "6. SALIR\n"
                    + "Ingrese el numero de su opcion: ";
            opcion =  Integer.parseInt(JOptionPane.showInputDialog(MenuP));
            switch(opcion){
                case 1:
                    String opt = "a";
                    String SubMenu = "--SubMENU--\n"
                        + "A. Maybach\n"
                        + "B. Morgan Aero 8\n"
                        + "C. Fisker Automotive\n"
                        + "D. Tramontana\n"
                        + "E. Cliente\n"
                        + "F. Empleado\n"
                        + "Ingrese el numero de su opcion: ";
                    opt = JOptionPane.showInputDialog(SubMenu).toLowerCase();
                    switch (opt){
                        case "a":
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            llantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la s llantas de repuesto (1 o 2)"));
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (155 a 160)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (50 a 55)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (400000 a 600000)"));
                            carros.add(new Maybach(nserie, df.parse(fechaensamblado), colorpintura, marcallantas, polarizado, velocidadmax, kilometrosgal, precioventa));
                            break;
                        case "b":
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            convertible = JOptionPane.showInputDialog("Ingrese si lo quiere convertible (S/N)");
                            tipocabina = JOptionPane.showInputDialog("Ingrese el tipo de Cabina (Unica o Doble)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (140 a 145)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (35 a 40)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (500000 a 700000)"));
                            carros.add(new MorganAero8(convertible, tipocabina, nserie, df.parse(fechaensamblado), colorpintura, marcallantas, polarizado, llantas, llantas, precioventa));
                            break;
                        case "c":
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            convertible = JOptionPane.showInputDialog("Ingrese si lo quiere convertible (S/N)");
                            tipoestilo = JOptionPane.showInputDialog("Ingrese el tipo de Cabina (camioneta o turismo)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (160 a 165)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (55 a 60)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (450000 a 650000)"));
                            carros.add(new FiskerAutomotive(tipoestilo, convertible, nserie, df.parse(fechaensamblado), colorpintura, marcallantas, polarizado, llantas, llantas, precioventa));
                            break;
                        case "d":
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del carro (1276 a 1376)"));
                            transmision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidades (6 o 7)"));
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (175 a 180)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (50 a 55)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (800000 a 1000000)"));
                            carros.add(new Tramontana(peso, transmision, nserie, df.parse(fechaensamblado), colorpintura, marcallantas, polarizado, llantas, llantas, precioventa));
                            break;
                        case "e":
                            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Id"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
                            pesop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
                            dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero a mano del cliente"));
                            cl.setCars(new Carros());
                            personas.add(new Cliente(dinero, nombre, id, edad, altura, peso));
                            break;
                        case "f":
                            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Id"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
                            pesop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
                            horastrabajo = JOptionPane.showInputDialog("Ingrese las horas de trabajos");
                            personas.add(new Empleados(horastrabajo, new Cliente(), nombre, id, edad, altura, peso));
                            break;
                    }
                    break;
                case 2:
                    String opt2 = "a";
                    String SubMenu2 = "--SubMENU--\n"
                        + "A. Maybach\n"
                        + "B. Morgan Aero 8\n"
                        + "C. Fisker Automotive\n"
                        + "D. Tramontana\n"
                        + "E. Cliente\n"
                        + "F. Empleado\n"
                        + "Ingrese el numero de su opcion: ";
                    opt2 = JOptionPane.showInputDialog(SubMenu2).toLowerCase();
                    switch (opt2) {
                        case "a":
                            String salida = "";
                            for (Object temp : carros) {
                                if (temp instanceof Maybach) {
                                    salida += carros.indexOf(temp) + " " + ((Maybach) temp) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            int pos = 0;
                            pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos del Carro a modificar"));
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            llantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la s llantas de repuesto (1 o 2)"));
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (155 a 160)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (50 a 55)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (400000 a 600000)"));
                            if (carros.get(pos) instanceof Maybach) {
                                ((Maybach)carros.get(pos)).setNserie(nserie);
                                ((Maybach)carros.get(pos)).setEnsamblado(df.parse(fechaensamblado));
                                ((Maybach)carros.get(pos)).setLlantas(marcallantas);
                                ((Maybach)carros.get(pos)).setLlantasprov(llantas);
                                ((Maybach)carros.get(pos)).setPolarizado(polarizado);
                                ((Maybach)carros.get(pos)).setVelocidadmax(llantas);
                                ((Maybach)carros.get(pos)).setKilometrosgal(kilometrosgal);
                                ((Maybach)carros.get(pos)).setPrecioventa(precioventa);
                            }
                            break;
                        case "b":
                            String salida1 = "";
                            for (Object temp : carros) {
                                if (temp instanceof MorganAero8) {
                                    salida1 += carros.indexOf(temp) + " " + ((MorganAero8) temp) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida1);
                            int pos1 = 0;
                            pos1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos del Carro a modificar"));
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            convertible = JOptionPane.showInputDialog("Ingrese si lo quiere convertible (S/N)");
                            tipocabina = JOptionPane.showInputDialog("Ingrese el tipo de Cabina (Unica o Doble)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (140 a 145)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (35 a 40)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (500000 a 700000)"));
                            if (carros.get(pos1) instanceof MorganAero8) {
                                ((MorganAero8)carros.get(pos1)).setNserie(nserie);
                                ((MorganAero8)carros.get(pos1)).setEnsamblado(df.parse(fechaensamblado));
                                ((MorganAero8)carros.get(pos1)).setLlantas(marcallantas);
                                ((MorganAero8)carros.get(pos1)).setPolarizado(polarizado);
                                ((MorganAero8)carros.get(pos1)).setVelocidadmax(llantas);
                                ((MorganAero8)carros.get(pos1)).setKilometrosgal(kilometrosgal);
                                ((MorganAero8)carros.get(pos1)).setPreciovemta(precioventa);
                                ((MorganAero8)carros.get(pos1)).setTipoCabina(tipocabina);
                                ((MorganAero8)carros.get(pos1)).setConvertible(convertible);
                            }
                            break;
                        case "c":
                            String salida2 = "";
                            for (Object temp : carros) {
                                if (temp instanceof FiskerAutomotive) {
                                    salida2 += carros.indexOf(temp) + " " + ((FiskerAutomotive) temp) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida2);
                            int pos2 = 0;
                            pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos2 del Carro a modificar"));
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            convertible = JOptionPane.showInputDialog("Ingrese si lo quiere convertible (S/N)");
                            tipoestilo = JOptionPane.showInputDialog("Ingrese el tipo de Cabina (camioneta o turismo)");
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (160 a 165)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (55 a 60)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (450000 a 650000)"));
                            if (carros.get(pos2) instanceof FiskerAutomotive) {
                                ((FiskerAutomotive)carros.get(pos2)).setNserie(nserie);
                                ((FiskerAutomotive)carros.get(pos2)).setEnsamblado(df.parse(fechaensamblado));
                                ((FiskerAutomotive)carros.get(pos2)).setLlantas(marcallantas);
                                ((FiskerAutomotive)carros.get(pos2)).setPolarizado(polarizado);
                                ((FiskerAutomotive)carros.get(pos2)).setVelocidadmax(llantas);
                                ((FiskerAutomotive)carros.get(pos2)).setKilometrosgal(kilometrosgal);
                                ((FiskerAutomotive)carros.get(pos2)).setPrecioventa(precioventa);
                                ((FiskerAutomotive)carros.get(pos2)).setConvertible(convertible);
                            }
                            break;
                        case "d":
                            String salida3 = "";
                            for (Object temp : carros) {
                                if (temp instanceof Tramontana) {
                                    salida3 += carros.indexOf(temp) + " " + ((Tramontana) temp) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida3);
                            int pos3 = 0;
                            pos3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos del Carro a modificar"));
                            nserie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie"));
                            fechaensamblado = JOptionPane.showInputDialog("Ingrese la fecha de Ensamblado, yyyy,MM,dd");
                            colorpintura = Color.BLACK;
                            marcallantas = JOptionPane.showInputDialog("Ingrese la marca de la llantas");
                            polarizado = JOptionPane.showInputDialog("Ingrese si quiere polarizado (S/N)");
                            peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del carro (1276 a 1376)"));
                            transmision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidades (6 o 7)"));
                            velocidadmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad maxima (175 a 180)"));
                            kilometrosgal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km/gal (50 a 55)"));
                            precioventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro (800000 a 1000000)"));
                            if (carros.get(pos3) instanceof Tramontana) {
                                ((Tramontana)carros.get(pos3)).setNserie(nserie);
                                ((Tramontana)carros.get(pos3)).setEnsamblado(df.parse(fechaensamblado));
                                ((Tramontana)carros.get(pos3)).setLlantas(marcallantas);
                                ((Tramontana)carros.get(pos3)).setPolarizado(polarizado);
                                ((Tramontana)carros.get(pos3)).setVelocidadmax(llantas);
                                ((Tramontana)carros.get(pos3)).setKilometrosgal(kilometrosgal);
                                ((Tramontana)carros.get(pos3)).setPrecioventa(precioventa);
                                ((Tramontana)carros.get(pos3)).setPrecio(precioventa);
                                ((Tramontana)carros.get(pos3)).setTransmision(transmision);
                            }
                            break;
                        case "e":
                            String salida4 = "";
                            for (Object temp : personas) {
                                if (temp instanceof Cliente) {
                                    salida4 += personas.indexOf(temp) + " " + ((Cliente) temp) + "\n";
                                }
                            }
                            int pos4 = 0;
                            pos4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos del persona a modificar"));
                            JOptionPane.showMessageDialog(null, salida4);
                            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Id"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
                            pesop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
                            dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero a mano del cliente"));
                            if (personas.get(pos4) instanceof Cliente) {
                                ((Cliente)personas.get(pos4)).setId(id);
                                ((Cliente)personas.get(pos4)).setAltura(altura);
                                ((Cliente)personas.get(pos4)).setNombre(nombre);
                                ((Cliente)personas.get(pos4)).setDinero(dinero);
                                ((Cliente)personas.get(pos4)).setPeso(pesop);
                                ((Cliente)personas.get(pos4)).setEdad(edad);
                            }
                            break;
                        case "f":
                            String salida5 = "";
                            for (Object temp : personas) {
                                if (temp instanceof Empleados) {
                                    salida5 += personas.indexOf(temp) + " " + ((Empleados) temp) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida5);
                            int pos5 = 0;
                            pos5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos del persona a modificar"));
                            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Id"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
                            pesop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso"));
                            horastrabajo = JOptionPane.showInputDialog("Ingrese las horas de trabajos");
                            if (personas.get(pos5) instanceof Empleados) {
                                ((Empleados)personas.get(pos5)).setId(id);
                                ((Empleados)personas.get(pos5)).setAltura(altura);
                                ((Empleados)personas.get(pos5)).setNombre(nombre);
                                ((Empleados)personas.get(pos5)).setPeso(pesop);
                                ((Empleados)personas.get(pos5)).setEdad(edad);
                                ((Empleados)personas.get(pos5)).setHorastrabajo(horastrabajo);
                            }
                            break;
                    }
                    break;
                case 3:
                    String opt3 = "a";
                    String SubMenu3 = "--SubMENU--\n"
                        + "A. Maybach\n"
                        + "B. Morgan Aero 8\n"
                        + "C. Fisker Automotive\n"
                        + "D. Tramontana\n"
                        + "E. Cliente\n"
                        + "F. Empleado\n"
                        + "Ingrese el numero de su opcion: ";
                    opt3 = JOptionPane.showInputDialog(SubMenu3).toLowerCase();
                    switch (opt3) {
                        case "a":
                            String salida = "";
                            int elim = 0;
                            for (Object temp : carros) {
                                if (temp instanceof Maybach) {
                                    salida += carros.indexOf(temp) + " " + ((Maybach) temp) + "\n";
                                }
                            }
                            elim = Integer.parseInt(JOptionPane.showInputDialog(salida));
                            carros.remove(elim);
                            break;
                        case "b":
                            String salida1 = "";
                            int elim2 = 0;
                            for (Object temp : carros) {
                                if (temp instanceof MorganAero8) {
                                    salida1 += carros.indexOf(temp) + " " + ((MorganAero8) temp) + "\n";
                                }
                            }
                            elim2 = Integer.parseInt(JOptionPane.showInputDialog(salida1));
                            carros.remove(elim2);
                            break;
                        case "c":
                            String salida2 = "";
                            int elim3 = 0;
                            for (Object temp : carros) {
                                if (temp instanceof FiskerAutomotive) {
                                    salida2 += carros.indexOf(temp) + " " + ((FiskerAutomotive) temp) + "\n";
                                }
                            }
                            elim3 = Integer.parseInt(JOptionPane.showInputDialog(salida2));
                            carros.remove(elim3);
                            break;
                        case "d":
                            String salida3 = "";
                            int elim4 = 0;
                            for (Object temp : carros) {
                                if (temp instanceof Tramontana) {
                                    salida3 += carros.indexOf(temp) + " " + ((Tramontana) temp) + "\n";
                                }
                            }
                            elim4 = Integer.parseInt(JOptionPane.showInputDialog(salida3));
                            carros.remove(elim4);
                            break;
                        case "e":
                            String salida4 = "";
                            int elim5 = 0;
                            for (Object temp : personas) {
                                if (temp instanceof Cliente) {
                                    salida4 += personas.indexOf(temp) + " " + ((Cliente) temp) + "\n";
                                }
                            }
                            elim5 = Integer.parseInt(JOptionPane.showInputDialog(salida4));
                            personas.remove(elim5);
                            break;
                        case "f":
                            String salida5 = "";
                            int elim6 = 0;
                            for (Object temp : personas) {
                                if (temp instanceof Empleados) {
                                    salida5 += personas.indexOf(temp) + " " + ((Empleados) temp) + "\n";
                                }
                            }
                            elim6 = Integer.parseInt(JOptionPane.showInputDialog(salida5));
                            personas.remove(elim6);
                            break;
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
        } while (opcion > 0 && opcion < 6);
        
    }
    
}
