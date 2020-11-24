package com.example.nbp.Database;

public class Currency {
    private String code, currency;
    private float mid;

    public Currency(String code, String currency, float mid) {
        this.code = code;
        this.currency = currency;
        this.mid = mid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getMid() {
        return mid;
    }

    public void setMid(float mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", currency='" + currency + '\'' +
                ", mid=" + mid +
                '}';
    }
}
