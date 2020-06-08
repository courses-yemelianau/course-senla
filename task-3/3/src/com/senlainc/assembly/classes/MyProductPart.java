package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.ProductPart;

public class MyProductPart implements ProductPart {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    MyProductPart(String name) {
        this.name = name;
        System.out.println("Product Part is Created!");
    }
}
