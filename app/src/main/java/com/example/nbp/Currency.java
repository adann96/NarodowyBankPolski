package com.example.nbp;

public class Currency {
    private String codeJson;
    private String currencyJson;
    private float midJson;

    public Currency(String codeJson, String currencyJson, float midJson) {
        super();
        this.codeJson = codeJson;
        this.currencyJson = currencyJson;
        this.midJson = midJson;
    }

    public float getMidJson() {
        return midJson;
    }

    @Override
    public String toString() {
        return midJson + " | " + codeJson + ": " + currencyJson;
    }
}
