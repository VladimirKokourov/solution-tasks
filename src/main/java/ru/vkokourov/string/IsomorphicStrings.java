package ru.vkokourov.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {

//    Given two strings s and t, determine if they are isomorphic.
//
//    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//    All occurrences of a character must be replaced with another character while preserving
//    the order of characters. No two characters may map to the same character, but a character may map to itself.

//    s = "egg", t = "add"  -  true
//    s = "foo", t = "bar"  -  false

    public boolean isIsomorphicStrings(final String s, final String t) {
        return charsToInt(s).equals(charsToInt(t));
    }

    public List<Integer> charsToInt(String str) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, count);
                count++;
            }

            list.add(map.get(ch));
        }
        return list;
    }
}
