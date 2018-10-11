package ru.const24;


/**
 * Класс деньги, содержит значение и валюту
 */
public class Money {
    Money(double value, Main.Currency moneyCurrency) {
        this.value = value;
        this.moneyCurrency = moneyCurrency;
    }

    double value;
    Main.Currency moneyCurrency;

    @Override
    public String toString() {
        return "ru.const24.Money{" +
                "" + value +
                " " + moneyCurrency +
                '}';
    }
}
