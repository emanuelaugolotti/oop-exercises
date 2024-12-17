package com.oopexercises1.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> outList = new ArrayList<>();
        for (String entry : strings) {
            try {
                CheckString.checkString(entry);
                outList.add(entry);
            } catch (ParseException ignored) {
            }
        }
        return outList;
    }
}
