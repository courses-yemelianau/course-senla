package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.IProductPart;

public class ProductPart implements IProductPart {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    ProductPart(String name) {
        this.name = name;
        System.out.println("Product Part Created!");
    }
}
