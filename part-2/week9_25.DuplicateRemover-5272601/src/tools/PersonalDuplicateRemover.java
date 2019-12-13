/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ryan Ben
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> uniqueStrings;
    private int dupllicatesCount;
    
    public PersonalDuplicateRemover() {
        this.uniqueStrings = new HashSet<String>();
        this.dupllicatesCount = 0;
    }
    
    @Override
    public void add(String characterString) {
        if (!this.uniqueStrings.contains(characterString)) {
            this.uniqueStrings.add(characterString);
        } else {
            this.dupllicatesCount++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dupllicatesCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.uniqueStrings;
    }

    @Override
    public void empty() {
        this.uniqueStrings.clear();
        this.dupllicatesCount = 0;
    }
    
}
