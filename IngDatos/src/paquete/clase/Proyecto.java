/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clase;

/**
 *
 * @author USER
 */
public class Proyecto {
    
    private String codigo_proyecto;
    private String nombre_proyecto;
    private String RUC;
    private String estado;
    private String fecha_inicio;
    private String fecha_fin;
    private int monto;
    private String prototipo;

    public Proyecto(){}

    public Proyecto(String codigo_proyecto, String nombre_proyecto, String RUC, String estado, String fecha_inicio, String fecha_fin, int monto, String prototipo) {
        this.codigo_proyecto = codigo_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.RUC = RUC;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.monto = monto;
        this.prototipo = prototipo;
    }
    
    public String getCodigo_proyecto() {
        return codigo_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public String getRUC() {
        return RUC;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public int getMonto() {
        return monto;
    }

    public String getPrototipo() {
        return prototipo;
    }

    public void setCodigo_proyecto(String codigo_proyecto) {
        this.codigo_proyecto = codigo_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setPrototipo(String prototipo) {
        this.prototipo = prototipo;
    }
    
    
}
    

