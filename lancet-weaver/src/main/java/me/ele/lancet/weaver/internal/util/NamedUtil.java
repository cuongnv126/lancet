package me.ele.lancet.weaver.internal.util;

/**
 * Created by cuongnv on Apr 08, 2023
 */

public class NamedUtil {
    public static String safeName(String name) {
        final StringBuilder newName = new StringBuilder();
        for (char c : name.toCharArray()) {
            if (isValidChar(c)) {
                newName.append(c);
            } else {
                newName.append("_");
            }
        }
        return newName.toString();
    }

    private static boolean isValidChar(char c) {
        if (c == '<' || c == '>') return false;

        // other condition

        return true;
    }
}
