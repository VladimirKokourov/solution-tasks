package ru.vkokourov.array;

public class SolutionCountChangesOfSign {

    //      {-1, 0, 0, 1} res = 1
    //      {0, -1, 0, 1} res = 1

    public int countChangesOfSign(int[] arr) {
        int result = 0;
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (temp * arr[i] < 0) {
                result++;
            }
            if (arr[i] != 0) {
                temp = arr[i];
            }
        }

        return result;
    }
}
