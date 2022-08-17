package com.hillel.ostapenko.homeworks.homework13;

public enum DrinksMachine {
    COFFEE("COFFEE"),
    TEA("TEA"),
    LEMONADE("LEMONADE"),
    MOJITO("MOJITO"),
    MINERAL("MINERAL"),
    COCA_COLA("COCA COLA");

    public String drinksChoice;

    DrinksMachine(String drinksChoice) {
        this.drinksChoice = drinksChoice;

    }

    public String getDrinksChoice() {
        return drinksChoice;
    }
}


