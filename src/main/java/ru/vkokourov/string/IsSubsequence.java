package ru.vkokourov.string;

public class IsSubsequence {

//    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//    A subsequence of a string is a new string that is formed from the original string by deleting some
//            (can be none) of the characters without disturbing the relative positions of the remaining characters.
//            (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

//    s = "abc", t = "ahbgdc"  -  true
//    s = "axc", t = "ahbgdc"  -  false

    public boolean isSubsequence(String s, String t) {
        int count = 0;
        String[] arrSubStr = s.split("");

        for (int i = 0; i < arrSubStr.length; i++) {
            count = t.indexOf(arrSubStr[i], count);
            if (count == -1) {
                return false;
            }
            count++;
        }
        return true;
    }
}
