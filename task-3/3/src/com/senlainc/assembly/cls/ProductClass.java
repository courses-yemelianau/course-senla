package com.senlainc.assembly.cls;

import com.senlainc.assembly.iface.*;

public class ProductClass implements Product {
    public ProductClass() {
        System.out.println("Product is Created!");
    }

    @Override
    public void installFirstPart(ProductPart productPart) {
        System.out.println("First part installed - " + productPart.toString());
    }

    @Override
    public void installSecondPart(ProductPart productPart) {
        System.out.println("Second part installed - " + productPart.toString());
    }

    @Override
    public void installThirdPart(ProductPart productPart) {
        System.out.println("Third part installed - " + productPart.toString());
    }
}
