package ru.vkokourov.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    public static Stream<Arguments> dataForIsPalindrome() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments("racecar", true));
        out.add(Arguments.arguments("carrac", true));
        out.add(Arguments.arguments("racrac", false));
        out.add(Arguments.arguments("r", true));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForIsPalindrome")
    void isPalindrome_shouldSuccess(String str, boolean expected) {
        boolean actual = palindrome.isPalindrome(str);
        assertEquals(expected, actual);
    }
}