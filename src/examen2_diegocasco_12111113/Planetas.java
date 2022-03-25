/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegocasco_12111113;

/**
 *
 * @author dcasc
 */
public class Planetas {
    private int size;
    private int peso;
    private String nombre;
    private int x;
    private int y;
    private String tipoplaneta;

    public Planetas() {
    }

    public Planetas(int size, int peso, String nombre, int x, int y, String tipoplaneta) {
        this.size = size;
        this.peso = peso;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.tipoplaneta = tipoplaneta;
    }

    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTipoplaneta() {
        return tipoplaneta;
    }

    public void setTipoplaneta(String tipoplaneta) {
        this.tipoplaneta = tipoplaneta;
    }
    
    
}
