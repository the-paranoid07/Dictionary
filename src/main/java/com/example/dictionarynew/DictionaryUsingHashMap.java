package com.example.dictionarynew;

import java.util.HashMap;

public class DictionaryUsingHashMap {

    private HashMap <String,String>dictonary;

    DictionaryUsingHashMap()
    {
        this.dictonary=new HashMap<>();
        addWordList();
    }

    public boolean addWord(String word,String meaning)
    {
        try{
            dictonary.put(word,meaning);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getMeaning(String word)
    {
        if(dictonary.containsKey(word)){
            return dictonary.get(word);
        }
        else{
            return "Word does not exist in the dictionary!";
        }

    }
    private void addWordList(){
        addWord("stop","to stop anything");
        addWord("shubh", "Auspicious");
        addWord("Phase", "a stage in the development of something");
        addWord("project", "an individual or collaborative enterprise that is carefully planned to achieve a particular aim");
        addWord("start", "beginning");
        addWord("Depreciating assets ", "Whose value decreases with time");

    }

}
