package com.padmaja.stringreplace;
import java.lang.String;


public class EqualityMethod {
    // Java program to Compare two strings
// lexicographically


        // This method compares two strings
        // lexicographically without using
        // library functions
        public static int stringCompare(String str1, String str2) {

            int l1 = str1.length();
            int l2 = str2.length();
            int lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int) str1.charAt(i);
                int str2_ch = (int) str2.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }

            // Edge case for strings like
            // String 1="Geeks" and String 2="Geeksforgeeks"

            if (l1 != l2) {
                return l1 - l2;
            }

            else {
                return 0;
            }// If none of the above conditions is true,
            // it implies both the strings are equal

        }

        // Driver function to test the above program


}



