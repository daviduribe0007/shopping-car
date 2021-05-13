package com.example.demo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarritoDeLaCompraTest {
    private final Integer TOTAL_SIZE = 20000000;
    private final Integer NUMBER_ADD = 1000000;
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

    @Test
    public void shouldDetectErrorAnThrowRuntimeExceptionWhenAPriceIsNegative(){
        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertTrue(carritoDeLaCompra.detectarError());
    }


}