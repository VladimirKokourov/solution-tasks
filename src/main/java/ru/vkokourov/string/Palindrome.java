package ru.vkokourov.string;

public class Palindrome {

//    Example 1: Return true if a given string is a palindrome, false otherwise.
//
//    A string is a palindrome if it reads the same forwards as backwards. That means, after reversing it,
//    it is still the same string. For example: "abcdcba", or "racecar".
//
//    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
//    number sorted in non-decreasing order.

//    racecar - true
//    raccar - true
//    racrac - false
//    r - true

    public boolean isPalindrome(String str) {

        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
