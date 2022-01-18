import javax.swing.JOptionPane;

public class AsignaturaGrafica {
    public static void main(String[]args){
        final double PORCENTAJE_LABORATORIO = 0.5;

        String nombre;
        double notaExamen;
        double notaLaboratorio;
        double notaFinal;

        nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del alumno");
        String entradaExamen = JOptionPane.showInputDialog(null,"Introduce la nota del examen");
        String entradaLaboratorio = JOptionPane.showInputDialog(null,"Introduce la nota del laboratorio");

        notaExamen = Integer.parseInt(entradaExamen);
        notaLaboratorio = Integer.parseInt(entradaLaboratorio);
    }
}
