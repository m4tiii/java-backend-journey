package pl.rokitowski.fundamentals.comparable_and_comparator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<String> slowa = new ArrayList<>(List.of("kot", "ala", "pies", "żaba", "a", "bóbr"));

        slowa.sort(
                Comparator.comparing(String::length)
                        .thenComparing(String::compareTo)
        );

        IO.println(slowa);


        List<Event> events = new ArrayList<>(List.of(
                new Event("Koncert", LocalDateTime.of(2026, 12, 5, 20, 0), new BigDecimal("150")),
                new Event("Kino",    LocalDateTime.of(2026, 11, 28, 18, 0), new BigDecimal("30")),
                new Event("Teatr",   LocalDateTime.of(2026, 12, 1, 19, 0), new BigDecimal("90"))
        ));

        Collections.sort(events);
        IO.println(events);
        events.sort(Event.BY_PRICE_DESCENDING);
        IO.println(events);
    }
}
