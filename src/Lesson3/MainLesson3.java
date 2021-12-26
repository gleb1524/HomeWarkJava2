package Lesson3;

import java.util.*;

public class MainLesson3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add("Java");
            list.add("Class");
            list.add("String");
            list.add("Method");
            list.add("Int");
        }
        list.add("Победа");
        int count = 0;

        Set<String> set = new HashSet<>();

        for(String s : list){
            set.add(s);
        }

        String[] arr = new String[set.size()];
        set.toArray(arr);

        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(arr[i].contains(list.get(j))) count++;
            }
            System.out.println("Слово " + arr[i] + " повторяется " + count + " раз(а).");
            count = 0;
        }

        System.out.println(set);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("8-963-653-44-45", "Глеб");
        telephoneDirectory.add("8-963-653-44-47", "Глеб");
        System.out.println(telephoneDirectory.get("Глеб"));
    }
}
