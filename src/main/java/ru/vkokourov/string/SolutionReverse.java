package ru.vkokourov.string;

public class SolutionReverse {

//    Write a function that reverses a string. The input string is given as an array of characters s.
//    You must do this by modifying the input array in-place with O(1) extra memory.

    public void reverse(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    private void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}