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

    @Test
    public void shouldCalculateTotalDiscount() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(20,100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotal(100));
    }

    @Test
    public void shouldCalculateTotalDiscountLambda() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(20,100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotalLambda(100));
    }

}