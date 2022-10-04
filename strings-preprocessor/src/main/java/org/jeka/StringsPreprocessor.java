package org.jeka;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsPreprocessor {
    public static Set<Character> getChars(List<String> stringsList) {
        Set<Character> result = stringsList
                .stream()
                .collect(Collectors.joining())
                .chars()
                .mapToObj(c -> (char)c)
//                .distinct()
                .collect(Collectors.toSet());
        return result;
    }
}
