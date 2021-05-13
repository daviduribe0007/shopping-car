package com.example.demo;

import java.util.Collection;

public class CarritoDeLaCompra {
    private Collection<Integer> precios;
    public CarritoDeLaCompra(Collection<Integer> precios) {
        this.precios = precios;
    }
    public int calcularPrecioTotalRefMethod() {
        int precioTotal = 0;
        for(Integer precio : precios){
            precioTotal += precio;
        }
        return precioTotal;
    }
    public int calcularPrecioTotalLambda() {
        return this.precios.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public long calcularDescuentoTotal(int cantidadConDescuento){
        long descuentoTotal = 0;

        for(Integer precio : precios){
            if(precio >= cantidadConDescuento){
                descuentoTotal += (cantidadConDescuento*5)/100;
            }
        }
        return descuentoTotal;
    }

    public int contarNumeroProductos() {
        return precios.size();
    }

}
