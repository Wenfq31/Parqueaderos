/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private int placa;
    private String contraseña;
    private String nombre_conductor;
    private String apellidos_conductor;
    private String email;
    private String tipo_vehiculo;
    private double saldo;
    private boolean premium;

    public Vehiculo(int placa, String contraseña, String nombre_conductor, String apellidos_conductor, String email, String tipo_vehiculo, double saldo, boolean premium) {
        this.placa = placa;
        this.contraseña = contraseña;
        this.nombre_conductor = nombre_conductor;
        this.apellidos_conductor = apellidos_conductor;
        this.email = email;
        this.tipo_vehiculo = tipo_vehiculo;
        this.saldo = saldo;
        this.premium = premium;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_conductor() {
        return nombre_conductor;
    }

    public void setNombre_conductor(String nombre_conductor) {
        this.nombre_conductor = nombre_conductor;
    }

    public String getApellidos_conductor() {
        return apellidos_conductor;
    }

    public void setApellidos_conductor(String apellidos_conductor) {
        this.apellidos_conductor = apellidos_conductor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", contrase\u00f1a=" + contraseña + ", nombre_conductor=" + nombre_conductor + ", apellidos_conductor=" + apellidos_conductor + ", email=" + email + ", tipo_vehiculo=" + tipo_vehiculo + ", saldo=" + saldo + ", premium=" + premium + '}';
    }
    
    
}
