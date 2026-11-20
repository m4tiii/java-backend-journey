package pl.rokitowski.fundamentals.comparable_and_comparator;

import java.util.ArrayList;
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
    }
}
