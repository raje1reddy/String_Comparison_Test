package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;

import static com.padmaja.stringreplace.EqualityMethod.stringCompare;
import static org.junit.Assert.assertEquals;

//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class EqualityMethodTest {

     /*@Test
     public  void  stringCompare1() {
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");

         // Comparing for String 1 < String 2
         System.out.println("Comparing " + string1 + " and " + string2
                 + " : " + stringCompare(string1, string2));

         // Comparing for String 3 = String 4
         System.out.println("Comparing " + string3 + " and " + string4
                 + " : " + stringCompare(string3, string4));

         // Comparing for String 1 > String 4
         System.out.println("Comparing " + string1 + " and " + string4
                 + " : " + stringCompare(string1, string4));

     }*/

     @Test
     public  void  stringCompare1() {
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         // Comparing for String 1 < String 2
         int result1 = stringCompare(string1, string2);
         System.out.println(result1);
         int expectedresult1 = -9;
         assertEquals(expectedresult1,result1);
     }
     @Test
     public  void  stringCompare2() {
         // Comparing for String 3 = String 4
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");
         int result2 = stringCompare(string3, string4);
         System.out.println(result2);
         int expectedresult2 = 0;
         assertEquals(expectedresult2,result2);
     }

     @Test
     public  void  stringCompare3() {
         // Comparing for String 1 > String 4
         String string1 = new String("Geeksforgeeks");
         String string4 = new String("Geeks");
         int result3 = stringCompare(string1, string4);
         System.out.println(result3);
         int expectedresult3 = 8;
         assertEquals(expectedresult3,result3);
     }

 }




