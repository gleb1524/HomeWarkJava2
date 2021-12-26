package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneDirectory {

    HashMap<String, String> telephoneDirectory = new HashMap<>();

    public void add(String i, String s){
        telephoneDirectory.put(i, s);
    }

    public Set get(String s){
        Set<String> str = new HashSet<>();
        for(Map.Entry<String, String> o : telephoneDirectory.entrySet()){
            if(o.getValue().equals(s)){
               str.add(o.getKey());
            }
        }
        return str;
    }
}
