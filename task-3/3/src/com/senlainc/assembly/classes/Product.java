package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.*;

public class Product implements IProduct {
    private ProductPart firstPart;
    private ProductPart secondPart;
    private ProductPart thirdPart;

    public Product() {
        System.out.println("Product Created!");
    }

    @Override
    public String toString() {
        return "Product{" +
                "firstPart=" + firstPart +
                ", secondPart=" + secondPart +
                ", thirdPart=" + thirdPart +
                '}';
    }

    @Override
    public void installFirstPart(IProductPart productPart) {
        this.firstPart = (ProductPart) productPart;
        System.out.println("First part installed - " + this.firstPart.toString());
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        this.secondPart = (ProductPart) productPart;
        System.out.println("Second part installed - " + this.secondPart.toString());
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        this.thirdPart = (ProductPart) productPart;
        System.out.println("Third part installed - " + this.thirdPart.toString());
    }
}
