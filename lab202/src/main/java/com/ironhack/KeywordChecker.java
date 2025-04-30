package com.ironhack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeywordChecker {

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
            "volatile", "while"
    ));

    public boolean containsJavaKeyword(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Replace all punctuation with spaces to ensure word boundaries
        String cleanInput = input.replaceAll("[\\p{Punct}]", " ");

        // Split the input into words
        String[] words = cleanInput.split("\\s+");

        // Check if any word is a Java keyword
        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                return true;
            }
        }

        return false;

    }


}
