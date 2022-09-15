/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private int id;
    private int placa;
    private Date fecha_entrada;
    private Date fecha_salida;
    private boolean disponible;
    private String puesto;

    public Reserva(int id, int placa, Date fecha_entrada, Date fecha_salida, boolean disponible, String puesto) {
        this.id = id;
        this.placa = placa;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.disponible = disponible;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", placa=" + placa + ", fecha_entrada=" + fecha_entrada + ", fecha_salida=" + fecha_salida + ", disponible=" + disponible + ", puesto=" + puesto + '}';
    }
    

    
   
    
    
}
