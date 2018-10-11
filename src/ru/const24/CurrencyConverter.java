package ru.const24;


/*
    Утилитный класс, знающий цену валютной единицы и осуществляющий, конвертацию
    из одной валютной еденицы в другую, напиример:
    unitUSD = 1, RUB = 66,9707, EUR = 0,85626
    тогда 10 рублей будут равны 0,14921 доллара
     */
public class CurrencyConverter {
    private final double unitUSD;
    private final double unitRUB;
    private final double unitEUR;

    public CurrencyConverter(double unitUSD, double unitRUB, double unitEUR) {
        this.unitUSD = unitUSD;
        this.unitRUB = unitRUB;
        this.unitEUR = unitEUR;
    }

    public Money convertByCurrencty(Money money, Main.Currency convertToCurrency) {
        //проверяем на совпадение исходной валюты и валюты, в которую конвертируем
        if (money.moneyCurrency != convertToCurrency) {
            //если конвертируемая валюта не равна заданной тогда расчитываем стоимость в заданной валюте

            Money returnMoney = new Money(0, convertToCurrency);
            double unitValue = 0;

            switch (convertToCurrency) {
                case RUB: {
                    unitValue = money.value * unitRUB;
                    break;
                }
                case EUR: {
                    unitValue = money.value * unitEUR;
                    break;
                }
                case USD: {
                    unitValue = money.value * unitUSD;
                    break;
                }
            }

            //записываем вычисленную сумму и возращаем результат
            returnMoney.value = unitValue;
            return returnMoney;
        } else {
            //возращаем сумму в исходной валюте т.к. конвертируемая валюта равна исходной
            return money;
        }
    }
}