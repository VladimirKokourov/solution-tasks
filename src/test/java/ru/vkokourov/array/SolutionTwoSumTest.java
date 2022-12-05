package ru.vkokourov.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTwoSumTest {

    private final SolutionTwoSum sum = new SolutionTwoSum();

    public static Stream<Arguments> dataForArrayTwoSum() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{3, 2, 3}, new int[]{0, 2}, 6));
        out.add(Arguments.arguments(new int[]{3, 2, 4}, new int[]{1, 2}, 6));
        out.add(Arguments.arguments(new int[]{3, 3}, new int[]{0, 1}, 6));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForArrayTwoSum")
    void twoSum_shouldBeSuccess(int[] arr, int[] expected, int target) {
        int[] actual = sum.twoSum(arr, target);

        assertArrayEquals(expected, actual);
    }
}