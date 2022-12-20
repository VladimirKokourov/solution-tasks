package ru.vkokourov.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {

    private final FindPivotIndex findPivotIndex = new FindPivotIndex();

    public static Stream<Arguments> dataForFindPivotIndex() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{1, 7, 3, 6, 5, 6}, 3));
        out.add(Arguments.arguments(new int[]{1, 2, 3}, -1));
        out.add(Arguments.arguments(new int[]{2, 1, -1}, 0));
        out.add(Arguments.arguments(new int[]{-1, -1, -1, -1, -1, 0}, 2));
        out.add(Arguments.arguments(new int[]{-1, -1, 0, 1, 0, -1}, 4));
        out.add(Arguments.arguments(new int[]{-1,-1,0,1,1,0}, 5));
        out.add(Arguments.arguments(new int[]{-1,-1,1,1,0,0}, 4));

        return out.stream();
    }

    public static Stream<Arguments> dataForSum() {
        List<Arguments> out = new ArrayList<>();

        out.add(Arguments.arguments(new int[]{1, 7, 3, 6, 5, 6}, 0, 2, 11));
        out.add(Arguments.arguments(new int[]{1, 2, 3}, 2, 2, 3));
        out.add(Arguments.arguments(new int[]{2, 1, -1}, 0, 0, 2));
        out.add(Arguments.arguments(new int[]{-1, -1, -1, -1, -1, 0}, 0, 4, -5));

        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForFindPivotIndex")
    void pivotIndex_shouldBeSuccess(int[] arr, int expected) {
        int actual = findPivotIndex.pivotIndex(arr);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForSum")
    void sum_shouldBeSuccess(int[] arr, int begin, int end, int expected) {
        int actual = findPivotIndex.sumOfRange(arr, begin, end);

        assertEquals(expected, actual);
    }
}