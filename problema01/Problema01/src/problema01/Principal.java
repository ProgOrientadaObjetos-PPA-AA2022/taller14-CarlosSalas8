/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.sql.SQLException;
import java.util.Scanner;
import paquete02.Enlace;
import paquete02.Trabajadores;

/**
 *
 * @author SALA I
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opciones;
        boolean bandera = true;

        do {
            Enlace enlace = new Enlace();

            System.out.println("Ingrese el nombre del Trabajador: ");
            String nombres = sc.nextLine();

            System.out.println("Ingrese la cedula del Trabajador: ");
            String cedula = sc.nextLine();

            System.out.println("Ingrese el correo del Trabajador: ");
            String correo = sc.nextLine();

            System.out.println("Ingrese el sueldo del Trabajador: ");
            double sueldo = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el mes del Sueldo: ");
            String mesSueldo = sc.nextLine();

            Trabajadores trab = new Trabajadores(nombres, cedula, correo, sueldo, mesSueldo);
            enlace.insertarTrabajadores(trab);

            System.out.println("Si no desea Ingresar mas elementos digite 1, "
                    + "si lo desea digite otro numero");
            opciones = sc.nextInt();
            if (opciones == 1) {
                bandera = false;
            }
        } while (bandera);

        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //             
    }
}
