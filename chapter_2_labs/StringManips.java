 // ***************************************************************
 //   StringManips.java
 //
 //   Test several methods for manipulating String objects
 // *************************************************************** 

import java.util.Scanner;

 public class StringManips
 {
     public static void main (String[] args)
     {
       Scanner scan = new Scanner(System.in);
       
       String phrase = new String ("This is a String test.");
       int phraseLength;   // number of chars in the phrase String
       int middleIndex;    // index of the middle char in the String
       String firstHalf;   // first half of the phrase String
       String secondHalf;  // second half of the phrase String
       String switchedPhrase; //a new phrase w/ orig halves switched
       String middle3 = phrase.substring(9,12);
       
       System.out.println("What city do you live in: \n");
       String city = new String(scan.next());
         
       System.out.println("What State do you live in: \n");
       String state = new String(scan.next());
       
       // compute the length and middle index of the phrase
       phraseLength = phrase.length();
       middleIndex = phraseLength / 2;
       
       // get the substring for each half of the phrase
       firstHalf = phrase.substring(0,middleIndex);
       secondHalf = phrase.substring(middleIndex, phraseLength);
       
       // concatenate the firstHalf at the end of the secondHalf
       switchedPhrase = secondHalf.concat(firstHalf);
       switchedPhrase = switchedPhrase.replace(" ", "*");
       
       // print information about the phrase
       System.out.println();
       System.out.println ("Original phrase: " + phrase);
       System.out.println ("Length of the phrase: " + phraseLength +
                           " characters");
       System.out.println ("Index of the middle: " + middleIndex);
       System.out.println ("Character at the middle index: " + 
                           phrase.charAt(middleIndex));
       System.out.println ("Switched phrase: " + switchedPhrase);
       System.out.println("middle 3 chars of phrase \"" + middle3 + "\"");
       System.out.println(state.toUpperCase()+city.toLowerCase()+state.toUpperCase());
       
       System.out.println();
     }
 }
