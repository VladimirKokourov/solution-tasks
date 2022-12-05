package ru.vkokourov.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionReverseTest {

    private final SolutionReverse solutionReverse = new SolutionReverse();

    public static Stream<Arguments> dataForArrayReverse() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}));
        out.add(Arguments.arguments(new char[]{'h', 'e', 'l', 'l', 'o', '!'}, new char[]{'!', 'o', 'l', 'l', 'e', 'h'}));
        out.add(Arguments.arguments(new char[]{'h', 'e'}, new char[]{'e', 'h'}));
        out.add(Arguments.arguments(new char[]{'h'}, new char[]{'h'}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForArrayReverse")
    void reverse_shouldSuccess(char[] arr, char[] expected) {
        solutionReverse.reverse(arr);
        assertArrayEquals(expected, arr);
    }
}