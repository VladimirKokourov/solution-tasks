package ru.vkokourov.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    private final IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    public static Stream<Arguments> dataForIsIsomorphicStrings() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments("add", "egg", true));
        out.add(Arguments.arguments("foo", "bar", false));
        out.add(Arguments.arguments("paper", "title", true));
        out.add(Arguments.arguments("bbbaaaba", "aaabbbba", false));
        out.add(Arguments.arguments("a", "a", true));
        out.add(Arguments.arguments("badc", "baba", false));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForIsIsomorphicStrings")
    void isIsomorphicStrings_shouldSuccess(String s, String t, boolean expected) {
        boolean actual = isomorphicStrings.isIsomorphicStrings(s, t);
        assertEquals(expected, actual);
    }
}