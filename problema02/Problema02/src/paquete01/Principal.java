

package paquete01;

import paquete02.Enlace;

/**
 *
 * @author salas
 */
public class Principal {

    public static void main(String[] args) {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataEstudiante().get(i));
        }
    }
}


    

