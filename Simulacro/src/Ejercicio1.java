import javax.swing.JOptionPane;


public class Ejercicio1 {

	public static void main(String[] args) {
		int totalPersonas = 0;
        int personasIngresadas = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        String input = JOptionPane.showInputDialog("Ingrese la cantidad de personas que desea registrar: ");
        int n = Integer.parseInt(input);

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
            String documento = JOptionPane.showInputDialog("Ingrese el documento de la persona: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
            String profesion = JOptionPane.showInputDialog("Ingrese la profesión de la persona: ");

            personasIngresadas++;

            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        totalPersonas = mayoresDeEdad + menoresDeEdad;

        String mensaje = "Total personas registradas: " + totalPersonas + "\n" +
                         "Cantidad de personas ingresadas: " + personasIngresadas + "\n" +
                         "Cantidad de personas mayores de edad: " + mayoresDeEdad + "\n" +
                         "Cantidad de personas menores de edad: " + menoresDeEdad;

        JOptionPane.showMessageDialog(null, mensaje);

        System.exit(0);
	}

}
