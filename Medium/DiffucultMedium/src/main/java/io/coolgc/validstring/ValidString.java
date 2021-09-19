package io.coolgc.validstring;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidString {

    public enum ANSWER {YES, NO}


    public static String isValid(String s) {

        if (s != null && !s.isEmpty()) {
            Map<String, Long> groupFrequencyMap = Stream.of(s.split(""))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(groupFrequencyMap.toString());

            Map<Long, List<String>> resultMap = groupFrequencyMap.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors
                            .mapping(Map.Entry::getKey, Collectors.toList())));
            System.out.println(resultMap.toString());


            if (resultMap.keySet().size() > 2)
                return ANSWER.NO.toString();
            else if (resultMap.keySet().size() == 1) {
                return ANSWER.YES.toString();
            } else if (resultMap.keySet().size() == 2) {
                Map<Long, Integer> onlyOneElement = resultMap.entrySet().stream().filter(i -> i.getValue().size() == 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, f -> f.getValue().size()));

                if (!onlyOneElement.isEmpty()) {

                    long frequencyDifference = 0L;

                    for (var frequency : resultMap.entrySet()) {
                        if (frequency.getKey() == 1 && resultMap.get(frequency.getKey()).size() == 1) {
                            return ANSWER.YES.toString();
                        }
                        frequencyDifference = frequency.getKey() - frequencyDifference;
                    }
                    if (frequencyDifference == 1) {
                        return ANSWER.YES.toString();
                    }
                }
            }
        }

        return ANSWER.NO.toString();


    }

}
