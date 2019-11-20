/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        String changeString = "";
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == fromCharacter) {
                changeString += toCharacter;
            } else {
                changeString += characterString.charAt(i);
            }
        }
        return changeString;
    }
}
