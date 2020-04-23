package com.senlainc.assembly.cls;

import com.senlainc.assembly.iface.*;

public class LineStepClass implements LineStep {
    int now = 0;
    ProductPartClass[] productParts = new ProductPartClass[3];

    public LineStepClass() {
        productParts[0] = new ProductPartClass("Body");
        productParts[1] = new ProductPartClass("Chassis");
        productParts[2] = new ProductPartClass("Engine");
        System.out.println("Line Step is Created!");
    }

    @Override
    public ProductPart buildProductPart() {
        System.out.println("Product Part is Ready!");
        return productParts[now < 3 ? now++ : (now = 0)];
    }
}
