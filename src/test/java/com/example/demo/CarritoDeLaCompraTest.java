package com.example.demo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarritoDeLaCompraTest {
    @Test
    public void shouldCalculateTotalPriceLambda() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(60, 5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotalLambda());
    }

    @Test
    public void shouldCalculateTotalPriceRefMethod() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotalRefMethod());
    }

}