/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import paquete02.Enlace;

/**
 *
 * @author SALA I
 */
public class Principal02 {

    public static void main(String[] args) {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataTrabajadores().size(); i++) {
            System.out.printf("%s", c.obtenerDataTrabajadores().get(i));
        }

    }

}
