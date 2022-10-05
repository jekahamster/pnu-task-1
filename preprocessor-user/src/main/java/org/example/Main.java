package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.jeka.StringsPreprocessor;

public class Main {
    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();

        stringsList.addAll(Arrays.asList(args));

        Set<Character> string_chars = StringsPreprocessor.getChars(stringsList);

        for (Character c : string_chars) {
            System.out.print(c);
        }
        System.out.println();
    }
}