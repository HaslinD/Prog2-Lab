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
    private static double velocidadmax;
    private static double kilometrosgal;
    private static double precioventa;
    private static DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    private static String convertible;
    private static String tipocabina;
    private static String tipoestilo;
    private static int peso;
    private static int transmision;
    public static void main(String[] args) throws ParseException {
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
                        + "Ingrese el numero de su opcion: ";
                    opt = JOptionPane.showInputDialog(SubMenu).toUpperCase();
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
                            carros.add(new Maybach(nserie, df.parse(fechaensamblado), colorpintura, marcallantas, polarizado, llantas, llantas, precioventa));
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
                    }
                    break;
                case 2:
                    String opt2 = "a";
                    String SubMenu2 = "--SubMENU--\n"
                        + "A. Maybach\n"
                        + "B. Morgan Aero 8\n"
                        + "C. Fisker Automotive\n"
                        + "D. Tramontana\n"
                        + "Ingrese el numero de su opcion: ";
                    opt2 = JOptionPane.showInputDialog(SubMenu2).toUpperCase();
                    switch (opt2) {
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
                            break;
                        case "d":
                            
                            break;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion > 0 && opcion < 6);
        
    }
    
}
