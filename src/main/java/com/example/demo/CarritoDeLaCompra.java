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
    public long calcularDescuentoTotalLambda(int cantidadConDescuento){

        Long numeroDeDescuentos = this.precios.stream()
                .filter(precio -> precio.intValue() >= cantidadConDescuento)
                .count();

        return (cantidadConDescuento*5/100)*numeroDeDescuentos;
    }

    public boolean detectarError() {
        boolean negativeFind = false;
        for (Integer precio : precios) {
            if (precio < 0) {
                negativeFind = true;
            }
        }
        return negativeFind;
    }

    public boolean detectarErrorAnyMatch() {
        return this.precios.stream().anyMatch(precio -> precio.intValue() < 0);
    }


    public int contarNumeroProductos() {
        return precios.size();
    }

}
