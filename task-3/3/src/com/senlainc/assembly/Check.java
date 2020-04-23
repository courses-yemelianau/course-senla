package com.senlainc.assembly;

import com.senlainc.assembly.cls.*;

public class Check {
    public static void main(String[] args) {
        new AssemblyLineClass(new LineStepClass()).assembleProduct(new ProductClass());
    }
}
