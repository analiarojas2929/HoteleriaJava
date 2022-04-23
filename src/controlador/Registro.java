/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import modelo.Cliente;
import modelo.Empleado;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import modelo.Habitacion;

/**
 *
 * @author Usuario
 */
public class Registro {

    //agregar clientes
    public boolean agregarCliente(Cliente cli) {
        Date fecha;
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            //new java.sql.Date(date.getTime())
            String query = "INSERT INTO cliente(rut, dv, nombre, apellido, genero, telefono, correo, tipoHabitacion, precio, fechaReserva, numHabitacion, direccion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cli.getRut()); //rut 
            stmt.setString(2, cli.getDv());//dv
            stmt.setString(3, cli.getNombre());//nombre
            stmt.setString(4, cli.getApellido());//apellido 
            stmt.setString(5, cli.getGenero());//genero
            stmt.setString(6, cli.getTelefono());//telefono
            stmt.setString(7, cli.getCorreo());//correo
            stmt.setString(8, cli.getTipoHabitacion());//tipoHabitacion
            stmt.setInt(9, cli.getPrecio());//precio
            stmt.setDate(10, new java.sql.Date(cli.getFechaReserva().getTime()));//fechaReserva
            stmt.setInt(11, cli.getNumHabitacion());//numhabitacion
            stmt.setString(12, cli.getDireccion());//direccion

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Cliente" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Cliente" + e.getMessage());
            return false;
        }
    }
    
    //listar clientes
     public List<Cliente> buscarTodosClientes() {
        List<Cliente> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, nombre, apellido, genero, telefono, correo, tipoHabitacion, precio, fechaReserva, numHabitacion, direccion FROM cliente order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
         
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setRut(rs.getInt("rut"));
                cli.setDv(rs.getString("dv"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setGenero(rs.getString("genero"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setCorreo(rs.getString("correo"));
                cli.setTipoHabitacion(rs.getString("tipoHabitacion"));
                cli.setPrecio(rs.getInt("precio"));
                cli.setFechaReserva(rs.getDate("fechaReserva"));
                cli.setNumHabitacion(rs.getInt("numHabitacion"));
                cli.setDireccion(rs.getString("direccion"));

                lista.add(cli);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar clientes" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar clientes" + e.getMessage());
        }
        return lista;
    }
     //buscar por tipo de habitacion a clientes
     public List<Cliente> buscarTipoHabitacionCliente(String tipoHabitacion) {
        List<Cliente> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, nombre, apellido, genero, telefono, correo, tipoHabitacion, precio, fechaReserva, numHabitacion, direccion FROM cliente WHERE tipoHabitacion = ? order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1,tipoHabitacion);
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setRut(rs.getInt("rut"));
                cli.setDv(rs.getString("dv"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setGenero(rs.getString("genero"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setCorreo(rs.getString("correo"));
                cli.setTipoHabitacion(rs.getString("tipoHabitacion"));
                cli.setPrecio(rs.getInt("precio"));
                cli.setFechaReserva(rs.getDate("fechaReserva"));
                cli.setNumHabitacion(rs.getInt("numHabitacion"));
                cli.setDireccion(rs.getString("direccion"));

                lista.add(cli);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar clientes" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar clientes" + e.getMessage());
        }
        return lista;
    }
     
    //eliminarcliente
    public boolean eliminarCliente(String Rut) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "DELETE FROM cliente WHERE Rut=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, Rut);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    //agregar empleado
    public boolean agregarEmpleado(Empleado emp) {
        Date fecha;
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            //new java.sql.Date(date.getTime())
            String query = "INSERT INTO empleado(rut, dv, nombre, apellido, direccion, telefono, genero, tipoEmpleado, fechaNacimiento, correo) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, emp.getRut()); //rut 
            stmt.setString(2, emp.getDv());//dv
            stmt.setString(3, emp.getNombre());//nombre
            stmt.setString(4, emp.getApellido());//apellido 
            stmt.setString(5, emp.getDireccion());//direccion
            stmt.setString(6, emp.getTelefono());//telefono
            stmt.setString(7, emp.getGenero());//genero
            stmt.setString(8, emp.getTipoEmpleado());//tipo empleado
            stmt.setDate(9, new java.sql.Date(emp.getFechaNacimiento().getTime()));//fecha nacimiento
            stmt.setString(10, emp.getCorreo());//correo

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Empleado" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Empleado" + e.getMessage());
            return false;
        }
    }
    
    
    public List<Empleado> buscarTodosEmpleado() {
        List<Empleado> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, nombre, apellido, genero, telefono, correo, fechaNacimiento,tipoEmpleado, direccion FROM cliente order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
         
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Empleado emp = new Empleado();

                emp.setRut(rs.getInt("rut"));
                emp.setDv(rs.getString("dv"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setGenero(rs.getString("genero"));
                emp.setTelefono(rs.getString("telefono"));
                emp.setCorreo(rs.getString("correo"));
                emp.setFechaNacimiento(rs.getDate("fecha nacimiento"));
                emp.setTipoEmpleado(rs.getString("tipo Empleado"));
                emp.setDireccion(rs.getString("direccion"));

                lista.add(emp);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar empleado" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar empleado" + e.getMessage());
        }
        return lista;
    }
    
    public List<Empleado> buscarTipoEmpleado(String tipoEmpleado){
        List<Empleado> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, nombre, apellido, genero, telefono, correo, fechaNacimiento,tipoEmpleado, direccion FROM empleado WHERE tipoEmpleado = ? order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1,tipoEmpleado);
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Empleado emp = new Empleado();

                emp.setRut(rs.getInt("rut"));
                emp.setDv(rs.getString("dv"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setGenero(rs.getString("genero"));
                emp.setTelefono(rs.getString("telefono"));
                emp.setCorreo(rs.getString("correo"));
                emp.setTipoEmpleado(rs.getString("tipoEmpleado"));
                emp.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                emp.setDireccion(rs.getString("direccion"));

                lista.add(emp);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar clientes" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar clientes" + e.getMessage());
        }
        return lista;
    }
        public boolean eliminarEmpleado(String Rut) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "DELETE FROM empleado WHERE Rut=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, Rut);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
    //agregar habitacion
    public boolean agregarHabitacion(Habitacion hab) {
        Date fecha;
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            //new java.sql.Date(date.getTime())
            String query = "INSERT INTO habitacion(numHabitacion, tipoHabitacion, precio) VALUES (?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, hab.getNumHabitacion()); //numHabitacion
            stmt.setString(2, hab.getTipoHabitacion());//tipoHabitacion
            stmt.setInt(3, hab.getPrecio());//precio
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Habitacion" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Habitacion" + e.getMessage());
            return false;
        }
    }
    //buscar todas las habitaciones
    public List<Habitacion> buscarTodasHabitaciones() {
        List<Habitacion> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT numHabitacion, tipoHabitacion, precio  FROM habitacion order by numHabitacion";
            PreparedStatement stmt = cnx.prepareStatement(query);
         
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Habitacion hb= new Habitacion();

                hb.setNumHabitacion(rs.getInt("numHabitacion"));
                hb.setTipoHabitacion(rs.getString("tipoHabitacion"));
                hb.setPrecio(rs.getInt("precio"));

                lista.add(hb);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar habitacion" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar habitacion" + e.getMessage());
        }
        return lista;
    }
    //buscar tipo habitacion
        public List<Habitacion> buscarTipoHabitacion(String tipoEmpleado){
        List<Habitacion> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT numHabitacion, tipoHabitacion, precio FROM habitacion WHERE tipoHabitacion = ? order by numHabitacion";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1,tipoEmpleado);
            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Habitacion hb = new Habitacion();

                hb.setNumHabitacion(rs.getInt("numHabitacion"));
                hb.setTipoHabitacion(rs.getString("tipoHabitacion"));
                hb.setPrecio(rs.getInt("precio"));

            lista.add(hb);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar habitacion" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar habitacion" + e.getMessage());
        }
        return lista;
    }
        //eliminar habitacion
        public boolean eliminarHabitacion(String numHabitacion) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "DELETE FROM habitacion WHERE numHabitacion=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, numHabitacion);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
        } catch (Exception e) {
            return false;
        }
    }
}

