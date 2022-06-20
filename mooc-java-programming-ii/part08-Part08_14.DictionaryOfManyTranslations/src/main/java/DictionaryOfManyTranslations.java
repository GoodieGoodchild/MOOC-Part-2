
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    private ArrayList<String> definition;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
        
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        definition = this.dictionary.get(word);
        definition.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        //returns a list of the translations added for the word. 
        //If the word has no translations, the method should return an empty list.
        
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.dictionary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DictionaryOfManyTranslations other = (DictionaryOfManyTranslations) obj;
        if (!Objects.equals(this.dictionary, other.dictionary)) {
            return false;
        }
        return true;
    }
    
}
