package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static Boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> stringArrayConvertedToList = Arrays.asList(array);
        Collections.reverse(stringArrayConvertedToList); // reversing the list using Collection.reverse() method a la Google
        String[] reversedArray = stringArrayConvertedToList.toArray(array); //make a new string array out of the reversed list called reversedArray
        return reversedArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        /* i need to loop through an iteration:
        1. check to see if array [0] == array [array.length -1]
            a. if no, break out and return false
            b. if yes, continue
        2. check to see if array [1] == array [array.length -2]
        3. continue looping array.length / 2 times
        4. if loop completes without breaking out, return true.
         */

        String[] arrayReversed = reverse(array);
        for (int i = 0; i < arrayReversed.length; i++) {
            String currentElementInReverse = arrayReversed[i];
            String currentElement = array[i];
            if (currentElementInReverse != currentElement) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String mergedArrayAsString = "";
        for (int i = 0; i < array.length; i++) {
            String currentArrayElement = array[i];  // fetching elements from the original array
            mergedArrayAsString += currentArrayElement;     // adding the current array element to a string called merged array
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = alphabet.split("");
        for (int i = 0; i < alphabetArray.length; i++) {
            String currentCharacter = alphabetArray[i];
            String[] mergedArray = mergedArrayAsString.split(""); //"The quick brown fox" >> "T" "h" "e" " "
            if (!contains(mergedArray, currentCharacter)) {
                return false;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            String currentValue = array[i];
            if (currentValue == value) {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            String currentElement = array[i];
            if (valueToRemove != currentElement) {
                list.add(currentElement);
            }
        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> result = new ArrayList<String>();
        String previousElement = null;
        for (int i = 0; i < array.length; i++) {
            String currentElement = array[i];
            Boolean sameConsecutiveElement = currentElement.equalsIgnoreCase(previousElement);
            if (!sameConsecutiveElement) {
                result.add(currentElement);
            }
            previousElement = currentElement;
        }

        int newArraySize = result.size();
        String[] unpopulatedArray = new String[newArraySize];
        String[] populatedArray = result.toArray(unpopulatedArray);
        return populatedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
