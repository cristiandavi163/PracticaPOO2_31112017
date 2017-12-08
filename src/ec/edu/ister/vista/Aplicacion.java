package ec.edu.ister.vista;

import ec.edu.ister.modelo.Auto;
import ec.edu.ister.modelo.Punto;
import javax.swing.JOptionPane;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {

    public static void main(String[] args) {
       Test test = new Test();
       Auto a = new Auto();
       test.metodo2(a);
        System.out.println(a.nombre);
    }

}
