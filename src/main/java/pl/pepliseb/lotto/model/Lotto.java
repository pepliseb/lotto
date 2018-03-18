package pl.pepliseb.lotto.model;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Lotto {
    public static List<Integer> generateLottoNumbers() {
        Random random = new Random();
        random.nextInt(49);
        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size() != 6) {
            numbers.add(random.nextInt(49) + 1);
        }
        return numbers.stream().collect(Collectors.toList());
    }
}
