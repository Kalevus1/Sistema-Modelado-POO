/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Kalevus
 */
public class Pedido {
    private String codPedido;
    private Date fechaPedido;
    private String estadoPedido;
    private String cantPedidos;

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(String cantPedidos) {
        this.cantPedidos = cantPedidos;
    }
}
