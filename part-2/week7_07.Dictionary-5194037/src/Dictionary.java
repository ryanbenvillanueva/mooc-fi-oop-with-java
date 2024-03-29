/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            translationList.add(key + " = " + this.translate(key));
        }
        return translationList;
    }
}
