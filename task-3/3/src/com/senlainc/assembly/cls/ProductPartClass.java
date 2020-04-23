package com.senlainc.assembly.cls;

import com.senlainc.assembly.iface.ProductPart;

public class ProductPartClass implements ProductPart {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    ProductPartClass(String name) {
        this.name = name;
        System.out.println("Product Part is Created!");
    }
}
