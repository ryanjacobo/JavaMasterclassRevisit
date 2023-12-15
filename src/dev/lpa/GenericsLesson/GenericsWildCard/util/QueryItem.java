package dev.lpa.GenericsLesson.GenericsWildCard.util;

public interface QueryItem {
    // search first arg and compare to second args
    boolean matchFieldValue(String fieldName, String value);
}
