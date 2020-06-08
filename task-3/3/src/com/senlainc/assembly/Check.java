package com.senlainc.assembly;

import com.senlainc.assembly.classes.*;

public class Check {
    public static void main(String[] args) {
        new MyAssemblyLine(new MyLineStep()).assembleProduct(new MyProduct());
    }
}
