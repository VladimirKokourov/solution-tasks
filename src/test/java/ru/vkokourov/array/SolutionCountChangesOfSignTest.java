package ru.vkokourov.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionCountChangesOfSignTest {

    private final SolutionCountChangesOfSign sign = new SolutionCountChangesOfSign();

    public static Stream<Arguments> dataForCountChangesOfSign() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{1, 0, 5, 1}, 0));
        out.add(Arguments.arguments(new int[]{1, 0, -5, -1}, 1));
        out.add(Arguments.arguments(new int[]{-1, 0, -1, 5, -1}, 2));
        out.add(Arguments.arguments(new int[]{0, -1}, 0));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForCountChangesOfSign")
    void countChangesOfSign_shouldBeSuccess(int[] arr, int expected) {
        int actual = sign.countChangesOfSign(arr);

        assertEquals(expected, actual);
    }
}