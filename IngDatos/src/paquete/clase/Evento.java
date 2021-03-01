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
public class Evento 
{
    private String codigo_evento;
    private String codigo_proyecto;
    private String nombre_proyecto;
    private String RUC;
    private String nombre_empresa;
    private String fecha;
    private String descripcion;
    
    public Evento(){}

    public Evento(String codigo_evento, String codigo_proyecto, String nombre_proyecto, String RUC, String nombre_empresa, String fecha, String descripcion) {
        this.codigo_evento = codigo_evento;
        this.codigo_proyecto = codigo_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.RUC = RUC;
        this.nombre_empresa = nombre_empresa;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getCodigo_evento() {
        return codigo_evento;
    }

    public void setCodigo_evento(String codigo_evento) {
        this.codigo_evento = codigo_evento;
    }

    public String getCodigo_proyecto() {
        return codigo_proyecto;
    }

    public void setCodigo_proyecto(String codigo_proyecto) {
        this.codigo_proyecto = codigo_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
