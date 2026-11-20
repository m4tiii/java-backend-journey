package pl.rokitowski.fundamentals.comparable_and_comparator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Comparator;

public record Event(String name, LocalDateTime startsAt, BigDecimal price) implements Comparable<Event>{

    @Override
    public int compareTo(Event o) {
        return startsAt.compareTo(o.startsAt);
    }

    public static final Comparator<Event> BY_PRICE_DESCENDING =
            Comparator.comparing(Event::price).reversed();
}
