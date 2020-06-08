package com.senlainc.assembly.classes;

import com.senlainc.assembly.interfaces.IAssemblyLine;
import com.senlainc.assembly.interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine {
    private final LineStep firstStep;
    private final LineStep secondStep;
    private final LineStep thirdStep;

    public AssemblyLine() {
        this.firstStep = new LineStep("Body");
        this.secondStep = new LineStep("Chassis");
        this.thirdStep = new LineStep("Engine");
        System.out.println("Assembly Line Created!");
    }

    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        iProduct.installFirstPart(firstStep.buildProductPart());
        iProduct.installSecondPart(secondStep.buildProductPart());
        iProduct.installThirdPart(thirdStep.buildProductPart());
        System.out.println("Product Ready!");
        return iProduct;
    }
}
