package com.cowaine.firewoody237.first_mission.ui.data;

public class InputParsedResult {
    private String name;
    private String currency;
    private int amount;

    public InputParsedResult(String name, String currency, int amount) {
        this.name = name;
        this.currency = currency;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }
}
