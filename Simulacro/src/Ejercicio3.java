import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato social del empleado: "));

        double sueldoActual = 500000;
        double valorDescuento = calcularDescuento(estrato);
        double sueldoConDescuento = calcularSueldoConDescuento(sueldoActual, valorDescuento);

        System.out.println("Nombre: " + nombre);
        System.out.println("Estrato: " + estrato);
        System.out.println("Sueldo actual con descuento: " + sueldoConDescuento);
    }

    public static double calcularDescuento(int estrato) {
        double valorDescuento = 0.0;

        switch (estrato) {
            case 1:
            case 2:
                valorDescuento = 0.02;
                break;
            case 3:
            case 4:
                valorDescuento = 0.04;
                break;
            case 5:
                valorDescuento = 0.08;
                break;
            case 6:
                valorDescuento = 0.10;
                break;
            default:
                System.out.println("Estrato no válido");
                break;
        }

        return valorDescuento;
    }

    public static double calcularSueldoConDescuento(double sueldo, double descuento) {
        return sueldo - (sueldo * descuento);
    }
}