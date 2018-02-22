/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Producto implements Serializable {

    private String descripcion;
    private int idproducto;
    private int stockminimo;
    private float pvp;
    private int stockactual;
    private PropertyChangeSupport propertySupport;

    public Producto() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public Producto(String descripcion, int idproducto, int stockminimo, float pvp, int stockactual) {
        this.descripcion = descripcion;
        this.idproducto = idproducto;
        this.stockminimo = stockminimo;
        this.pvp = pvp;
        this.stockactual = stockactual;
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setStockactual(int stockactual) {
        if (stockactual < stockminimo) {
            propertySupport.firePropertyChange("stockactual", this.getStockactual(), stockactual);
        }
        this.stockactual = stockactual;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
