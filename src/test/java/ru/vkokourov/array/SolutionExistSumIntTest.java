package ru.vkokourov.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionExistSumIntTest {

    private final SolutionExistSumInt sumInt = new SolutionExistSumInt();

    public static Stream<Arguments> dataForArrayExistSum() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{-5, -4, -3, -2, -1}, -6, true));
        out.add(Arguments.arguments(new int[]{-5, -4, -3, -2}, -3, false));
        out.add(Arguments.arguments(new int[]{1, 2}, 3, true));
        out.add(Arguments.arguments(new int[]{0, 2}, 3, false));
        out.add(Arguments.arguments(new int[]{1, 2, 4, 6, 8, 9, 14}, 13, true));
        out.add(Arguments.arguments(new int[]{1, 2, 3, 6, 8, 9, 14}, 13, false));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForArrayExistSum")
    void existSum_shouldBeSuccess(int[] arr, int target, boolean expected) {
        boolean actual = sumInt.existSum(arr, target);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForArrayExistSum")
    void existSumWithHashMap_shouldBeSuccess(int[] arr, int target, boolean expected) {
        boolean actual = sumInt.existSumWithHashMap(arr, target);

        assertEquals(expected, actual);
    }
}