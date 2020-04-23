package com.senlainc.assembly.cls;

import com.senlainc.assembly.iface.AssemblyLine;
import com.senlainc.assembly.iface.Product;

public class AssemblyLineClass implements AssemblyLine {
    private final LineStepClass lineStep;

    public AssemblyLineClass(LineStepClass lineStep) {
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
