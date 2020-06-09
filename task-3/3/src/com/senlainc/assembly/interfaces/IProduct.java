package com.senlainc.assembly.interfaces;

public interface IProduct {
    void installFirstPart(IProductPart productPart);

    void installSecondPart(IProductPart productPart);

    void installThirdPart(IProductPart productPart);
}
