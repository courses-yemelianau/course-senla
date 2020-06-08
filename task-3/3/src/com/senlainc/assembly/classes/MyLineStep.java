package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.*;

public class MyLineStep implements LineStep {
    int now = 0;
    MyProductPart[] productParts = new MyProductPart[3];

    public MyLineStep() {
        productParts[0] = new MyProductPart("Body");
        productParts[1] = new MyProductPart("Chassis");
        productParts[2] = new MyProductPart("Engine");
        System.out.println("Line Step is Created!");
    }

    @Override
    public ProductPart buildProductPart() {
        System.out.println("Product Part is Ready!");
        return productParts[now < 3 ? now++ : (now = 0)];
    }
}
