/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author oracle
 */
public class Pedido implements Serializable, PropertyChangeListener {

    private int numeropedido;
    private int idproducto;
    private Date fecha;
    private int cantidad;
    private boolean pedir;

    public Pedido() {

    }

    public Pedido(int numeropedido, int idproducto, Date fecha, int cantidad) {
        this.numeropedido = numeropedido;
        this.idproducto = idproducto;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getNumeropedido() {
        return numeropedido;
    }

    public void setNumeropedido(int numeropedido) {
        this.numeropedido = numeropedido;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isPedir() {
        return pedir;
    }

    public void setPedir(boolean pedir) {
        this.pedir = pedir;
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("Stock Anterior: " + pce.getOldValue());
        System.out.println("Stock Actual: " + pce.getNewValue());
        pedir = true;
    }

}
