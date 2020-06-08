package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.AssemblyLine;
import com.senlainc.assembly.interfaces.Product;

public class MyAssemblyLine implements AssemblyLine {
    private final MyLineStep lineStep;

    public MyAssemblyLine(MyLineStep lineStep) {
        this.lineStep = lineStep;
        System.out.println("Assembly Line Created!");
    }

    @Override
    public Product assembleProduct(Product product) {
        product.installFirstPart(lineStep.buildProductPart());
        product.installSecondPart(lineStep.buildProductPart());
        product.installThirdPart(lineStep.buildProductPart());
        System.out.println("Product is Ready!");
        return product;
    }
}
