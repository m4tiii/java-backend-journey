package pl.rokitowski.fundamentals.big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

public class Main {

    public static BigDecimal total(List<BigDecimal> prices, BigDecimal vatPercent) {
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            if(price == null) {
                throw new IllegalArgumentException("One of the products has a null value");
            }

            totalAmount = totalAmount.add(price);
        }

        totalAmount = totalAmount.add(
                totalAmount.multiply(
                        vatPercent.movePointLeft(2)
                )
        );
        return totalAmount.setScale(2, RoundingMode.HALF_UP);
    }

    static void main(String[] args) {
        BigDecimal a = new BigDecimal("150");
        BigDecimal b = new BigDecimal("150");
        BigDecimal vatPercent = new BigDecimal("23.5");

        List<BigDecimal> list = Arrays.asList(a, b);

        IO.println(total(list, vatPercent));

        Currency pln = Currency.getInstance("PLN");
        Currency eur = Currency.getInstance("EUR");

        Money bilet = new Money(new BigDecimal("50"), pln);
        IO.println(bilet.multiply(new BigDecimal("3")));          // 150.00 PLN
        IO.println(bilet.add(new Money(new BigDecimal("0.10"), pln))); // 50.10 PLN
        IO.println(bilet.add(new Money(new BigDecimal("10"), eur)));   // wyjątek
    }
}
