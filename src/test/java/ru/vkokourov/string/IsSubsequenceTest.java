package ru.vkokourov.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private final IsSubsequence isSubsequence = new IsSubsequence();

    public static Stream<Arguments> dataForIsSubsequence() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments("abc", "ahbgdc", true));
        out.add(Arguments.arguments("axc", "ahbgdc", false));
        out.add(Arguments.arguments("aaa", "ahbagdca", true));
        out.add(Arguments.arguments("aaa", "ahbgdca", false));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForIsSubsequence")
    void isIsomorphicStrings_shouldSuccess(String s, String t, boolean expected) {
        boolean actual = isSubsequence.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}