package org.jeka;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        List<String> stringsList = new ArrayList<>();

        for (String s : args) {
            stringsList.add(s);
        }

        Set<Character> string_chars = StringsPreprocessor.getChars(stringsList);

        for (Character c : string_chars) {
            System.out.print(c);
        }
        System.out.println();
    }
}
