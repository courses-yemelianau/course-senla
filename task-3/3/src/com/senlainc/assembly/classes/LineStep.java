package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.*;

public class LineStep implements ILineStep {
    private final ProductPart productPart;

    public LineStep(String name) {
        productPart = new ProductPart(name);
        System.out.println("Line Step for " + name + " Created!");
    }

    @Override
    public IProductPart buildProductPart() {
        System.out.println("Product Part Ready!");
        return productPart;
    }
}
