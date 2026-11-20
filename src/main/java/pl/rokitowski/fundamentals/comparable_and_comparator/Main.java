package pl.rokitowski.fundamentals.comparable_and_comparator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

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

        Comparator<Integer> zly = Integer::compareTo;

        Random r = new Random();
        for (int proba = 1; proba <= 100; proba++) {
            List<Integer> lista = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                lista.add(r.nextInt(10));        // dużo powtórzeń: 0–9
            }
            try {
                lista.sort(zly);
            } catch (IllegalArgumentException e) {
                IO.println("Próba " + proba + ": " + e.getMessage());
                return;
            }
        }
        IO.println("Nie wysypało się w 100 próbach");

    }
}
