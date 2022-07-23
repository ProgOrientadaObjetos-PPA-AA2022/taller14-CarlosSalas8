/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Trabajadores {

    private String nombres;
    private String cedula;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajadores(String nom, String ced, String cor, double suel, String mes) {
        nombres = nom;
        cedula = ced;
        correo = cor;
        sueldo = suel;
        mesSueldo = mes;
    }

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerCorreo(String cor) {
        correo = cor;
    }

    public void establecerSueldos(double suel) {
        sueldo = suel;
    }

    public void establecerMesSueldo(String mes) {
        mesSueldo = mes;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldos() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

    @Override
    public String toString() {
        String data = String.format("Nombre: %s\n"
                + "Cedula: %s\n"
                + "Correo: %s\n"
                + "Sueldos: %.2f\n"
                + "Mes del Sueldo: %s\n",
                obtenerNombres(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldos(),
                obtenerMesSueldo());
        return data;
    }

}
