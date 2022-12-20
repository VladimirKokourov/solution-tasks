package ru.vkokourov.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortSquaresOfNumberTest {
    private final SortSquaresOfNumber sortSquaresOfNumber = new SortSquaresOfNumber();

    public static Stream<Arguments> dataForSortSquares() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}));
        out.add(Arguments.arguments(new int[]{-7, -3, -2, -1}, new int[]{1, 4, 9, 49}));
        out.add(Arguments.arguments(new int[]{0}, new int[]{0}));
        out.add(Arguments.arguments(new int[]{-1}, new int[]{1}));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForSortSquares")
    void sortSquares_shouldBeSuccess(int[] nums, int[] expected) {
        int[] actual = sortSquaresOfNumber.sortSquares(nums);

        assertArrayEquals(expected, actual);
    }
}