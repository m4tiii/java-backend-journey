package pl.rokitowski.fundamentals.big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public record Money(BigDecimal amount, Currency currency) {
        public Money{
            if (amount == null || currency == null){
                throw new IllegalArgumentException("Amount and currency cannot be null");
            }
            amount = amount.setScale(2, RoundingMode.HALF_EVEN);
        }

        public Money add(Money other){
            if(other == null) { throw new NullPointerException("Money cannot be null"); }
            if(!currency.equals(other.currency)){
                throw new IllegalArgumentException("Currencies are different, cannot sum them");
            }
            return new Money(amount.add(other.amount).setScale(2, RoundingMode.HALF_EVEN), currency);
        }

        public Money multiply(BigDecimal factor){
            if(factor == null) { throw new IllegalArgumentException("Factor cannot be null"); }
            return new Money(amount.multiply(factor).setScale(2, RoundingMode.HALF_EVEN), currency);
        }
}
