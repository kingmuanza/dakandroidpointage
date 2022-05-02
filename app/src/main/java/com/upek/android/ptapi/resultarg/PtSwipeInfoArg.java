package com.upek.android.ptapi.resultarg;

import com.upek.android.ptapi.struct.PtSwipeInfo;

public class PtSwipeInfoArg implements PtSwipeInfoArgI {
    private static final long serialVersionUID = 4102863057288114056L;
    public PtSwipeInfo value;

    public void setValue(PtSwipeInfo value) {
        this.value = value;
    }

    public PtSwipeInfo getValue() {
        return this.value;
    }
}
