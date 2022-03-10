package Algoritham;

import java.util.*;

//One string is an anagram of another if the second is simply a rearrangement of the first

public class AnagramDetection {

  static void isAnagram(String str1, String str2) {
//      Scanner sc = new Scanner(System.in);
//      String st = sc.next();
      String string1 = str1.replaceAll("\\s", "");
      String string2 = str2.replaceAll("\\s", "");
      boolean status = true;
      if (string1.length() != string2.length()) {
          status = false;
      } else {
          char[] ArrayS1 = string1.toLowerCase().toCharArray();
          char[] ArrayS2 = string2.toLowerCase().toCharArray();
          Arrays.sort(ArrayS1);
          Arrays.sort(ArrayS2);
          status = Arrays.equals(ArrayS1, ArrayS2);
      }
      if (status) {
          System.out.println(string1 + " and " + string2 + " are anagrams");
      } else {
          System.out.println(string1 + " and " + string2 + " are not anagrams");
      }
  }

  public static void main(String[] args) {
      isAnagram("abcd", "dcba");
      isAnagram("heart", "earth");
      isAnagram("Heart", "earth");
      isAnagram("How", "who");
      isAnagram("hear","here");
  }
}
