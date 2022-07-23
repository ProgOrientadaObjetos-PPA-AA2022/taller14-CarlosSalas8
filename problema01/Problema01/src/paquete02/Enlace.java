/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base0001.base.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajadores(Trabajadores trabajador) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajadores (nombres, cedula, correo, sueldo, mesSueldo) "
                    + "values ('%s', '%s', '%s', '%.2f', '%s')", trabajador.obtenerNombres(),
                    trabajador.obtenerCedula(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldos(),
                    trabajador.obtenerMesSueldo());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajadores");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Trabajadores> obtenerDataTrabajadores() {
        ArrayList<Trabajadores> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajadores;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Trabajadores trab = new Trabajadores(rs.getString("nombres"),
                        rs.getString("cedula"),
                        rs.getString("correo"),
                        rs.getDouble("sueldo"),
                        rs.getString("mesSueldo"));
                lista.add(trab);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajadores");
            System.out.println(e.getMessage());

        }
        return lista;
    }
    

}
