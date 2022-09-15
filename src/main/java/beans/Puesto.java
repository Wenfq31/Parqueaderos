/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Puesto {
    private int id;
    private String puesto;
    private String zona;
    private boolean disponible;

    public Puesto(int id, String puesto, String zona, boolean disponible) {
        this.id = id;
        this.puesto = puesto;
        this.zona = zona;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Puesto{" + "id=" + id + ", puesto=" + puesto + ", zona=" + zona + ", disponible=" + disponible + '}';
    }
    
}
