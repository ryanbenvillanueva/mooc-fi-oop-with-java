/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ryan Ben
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        int wordCount = 0;

        while (reader.hasNext()) {
            wordCount += 1;
            reader.next();
        }

        return wordCount;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsContainingZ = new ArrayList<String>();

        while (reader.hasNext()) {
            String word = reader.next();

            if (word.contains("z")) {
                wordsContainingZ.add(word);
            }
        }

        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsEndingInL = new ArrayList<String>();

        while (reader.hasNext()) {
            String word = reader.next();

            if (word.endsWith("l")) {
                wordsEndingInL.add(word);
            }
        }

        return wordsEndingInL;
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> palindromes = new ArrayList<String>();

        while (reader.hasNext()) {
            String word = reader.next();
            int front = 0;
            int back = word.length() - 1;
            boolean isPalindrome = true;

            while (front < back) {
                if (word.charAt(front) != word.charAt(back)) {
                    isPalindrome = false;
                    break;
                }
                
                front++;
                back--;
            }
            
            if (isPalindrome) {
                palindromes.add(word);
            }
        }
        
        return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsWhichContainAllVowels = new ArrayList<String>();
        char[] vowels = "aeiouyäö".toCharArray();
        
        while (reader.hasNext()) {
            String word = reader.next();
            boolean containsAllVowels = true;
            
            for (char vowel : vowels) {
                if (!word.contains("" + vowel)) {
                    containsAllVowels = false;
                    break;
                }
            }
            
            if (containsAllVowels) {
                wordsWhichContainAllVowels.add(word);
            }
        }
        
        return wordsWhichContainAllVowels;
    }
}
