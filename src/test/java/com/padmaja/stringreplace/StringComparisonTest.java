package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;
import java.util.Objects;
//import java.util.Objects;

import static com.padmaja.stringreplace.StringComparison.stringCompare;
import static org.junit.Assert.assertEquals;


//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class StringComparisonTest {


     /*@Test
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
*/
     @Test
     public  void  stringCompare4() {
         // Comparing for String 1 != String 2
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         boolean result =  string1.equals(string2);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare5() {
         // Comparing for String 3 = String 4
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");
         boolean result =  string3.equals(string4);
         System.out.println(result);
         boolean expectedresult = true;
         assertEquals(expectedresult,result);
     }


     @Test
     public  void  stringCompare6() {
         // Comparing for String 4 != String 5
         String string4 = new String("Geeks");
         String string5 = new String("geeks");
         boolean result =  string4.equals(string5);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }


     @Test
     public  void  stringCompare7() {
         // Comparing for String 1 != String 4
         String string1 = new String("Geeksforgeeks");
         String string4 = new String("Geeks");
         boolean result =  string1.equals(string4);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare8() {
         // Comparing for String 1 != String 2
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         boolean result =  string1.equalsIgnoreCase(string2);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare19() {
         // Comparing for String 3 = String 4
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");
         boolean result =  string3.equalsIgnoreCase(string4);
         System.out.println(result);
         boolean expectedresult = true;
         assertEquals(expectedresult,result);
     }


     @Test
     public  void  stringCompare10() {
         // Comparing for String 4 = String 5
         String string4 = new String("Geeks");
         String string5 = new String("geeks");
         boolean result =  string4.equalsIgnoreCase(string5);
         System.out.println(result);
         boolean expectedresult = true;
         assertEquals(expectedresult,result);
     }
     @Test
     public  void  stringCompare11() {
         // Comparing for String 1 != String 4
         String string1 = new String("Geeksforgeeks");
         String string4 = new String("Geeks");
         boolean result =  string1.equalsIgnoreCase(string4);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare12() {
         // Comparing for String 1 != String 2
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Geeks");
         boolean result =  Objects.equals(string1,string2);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare9() {
         // Comparing for String 2 = String 3
         String string2 = new String("Geeks");
         String string3 = new String("Geeks");
         boolean result =  Objects.equals(string2,string3);
         System.out.println(result);
         boolean expectedresult = true;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare13() {
         // Comparing for String 1 != String 4
         String string1 = new String("Geeksforgeeks");
         String string4 = new String("null");
         boolean result =  Objects.equals(string1,string4);
         System.out.println(result);
         boolean expectedresult = false;
         assertEquals(expectedresult,result);
     }
     @Test
     public  void  stringCompare14() {
         // Comparing for String 4 = String 5
         String string4 = new String("null");
         String string5 = new String("null");
         boolean result =  Objects.equals(string4,string5);
         System.out.println(result);
         boolean expectedresult = true;
         assertEquals(expectedresult,result);
     }


     @Test
     public  void  stringCompare15() {
         String string1 = new String("Geeksforgeeks");
         String string2 = new String("Practice");
         // Comparing for String 1 < String 2
         int result = string1.compareTo(string2);
         System.out.println(result);
         int expectedresult = -9;
         assertEquals(expectedresult,result);
     }
     @Test
     public  void  stringCompare16() {
         // Comparing for String 3 = String 4
         String string3 = new String("Geeks");
         String string4 = new String("Geeks");
         int result = string3.compareTo(string4);
         System.out.println(result);
         int expectedresult = 0;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare17() {
         // Comparing for String 1 > String 4
         String string1 = new String("Geeksforgeeks");
         String string4 = new String("Geeks");
         int result = string1.compareTo(string4);
         System.out.println(result);
         int expectedresult = 8;
         assertEquals(expectedresult,result);
     }
     //Why to avoid == operator
     //== operator is for reference comparison i.e address comparion
     //.equals method for content comparison

     @Test
     public  void  stringCompare18() {
         // Comparing for String 1 = String 2
         String string1 = new String("HELLO");
         String string2 = new String("HELLO");
         boolean result = string1 == string2;
         System.out.println(result);
         boolean  expectedresult = false;
         assertEquals(expectedresult,result);
     }

     @Test
     public  void  stringCompare() {
         // Comparing for String 1 = String 2
         String string11 = new String("HELLO");
         String string12 = new String("HELLO");
         boolean result = string11.equals(string12);
         System.out.println(result);
         boolean  expectedresult = true;
         assertEquals(expectedresult,result);
     }



 }




