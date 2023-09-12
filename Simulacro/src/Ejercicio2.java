import javax.swing.JOptionPane;


public class Ejercicio2 {

	public static void main(String[] args) {
		String tamanoInput = JOptionPane.showInputDialog("Ingrese el tamaño de los arreglos: ");
        int tamano = Integer.parseInt(tamanoInput);

        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] arregloResultado = new int[tamano];

        JOptionPane.showMessageDialog(null, "Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < tamano; i++) {
            String elementoInput = JOptionPane.showInputDialog("Elemento " + (i + 1) + ": ");
            arreglo1[i] = Integer.parseInt(elementoInput);
        }

        JOptionPane.showMessageDialog(null, "Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < tamano; i++) {
            String elementoInput = JOptionPane.showInputDialog("Elemento " + (i + 1) + ": ");
            arreglo2[i] = Integer.parseInt(elementoInput);
        }

        for (int i = 0; i < tamano; i++) {
            arregloResultado[i] = arreglo1[i] + arreglo2[i];
        }

        mostrarArreglo("Arreglo 1:", arreglo1);
        mostrarArreglo("Arreglo 2:", arreglo2);

        mostrarArreglo("Arreglo Resultado (Suma):", arregloResultado);
    }

    public static void mostrarArreglo(String titulo, int[] arreglo) {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append(titulo).append("\n");
        for (int i = 0; i < arreglo.length; i++) {
            mensaje.append(arreglo[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
	}
}
