/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author salas
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String nom, String ape, double cal1, double cal2, double cal3) {
        nombre = nom;
        apellido = ape;
        calificacion1 = cal1;
        calificacion2 = cal2;
        calificacion3 = cal3;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerCalificacion1(double cal1) {
        calificacion1 = cal1;
    }

    public void establecerCalificacion2(double cal2) {
        calificacion2 = cal2;
    }

    public void establecerCalificacion3(double cal3) {
        calificacion3 = cal3;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;

    }

    @Override
    public String toString() {

        String cadena = String.format("%s %s\n"
                + "\tCalificaciones:\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\tPromedio: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());

        return cadena;
    }

}
