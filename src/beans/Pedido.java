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
        pedir = false;
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("Stock Anterior: " + pce.getOldValue());
        System.out.println("Stock Actual: " + pce.getNewValue());
        pedir = true;
    }

}
