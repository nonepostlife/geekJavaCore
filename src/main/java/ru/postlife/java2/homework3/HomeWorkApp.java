package ru.postlife.java2.homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HomeWorkApp {
    public static void main(String[] args) {
        String[] words = {"акробат", "жердочка", "труба", "карат", "лак", "косичка", "кадет", "бутылка",
                "кран", "каучук", "лак", "крупа", "труба", "нектар", "коньяк", "акробат", "кран",
                "акробат", "воз", "устрица", "бутылка", "навес", "труба", "старец", "каемка", "воз"
        };

        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println("Список уникальных слов:");
        System.out.println(set);

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Слова и их количество:");
        System.out.println(map);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Петров","983256293");
        phonebook.add("Соколова","3462346346");
        phonebook.add("Иванищев","21489735345");
        phonebook.add("Денисова","325219751");
        phonebook.add("Петров","315135132");
        phonebook.add("Комаров","32464752452");
        phonebook.add("Артамонов","246472426");
        phonebook.add("Петров","657832562");
        phonebook.add("Комаров","2326275224");

        phonebook.get("Петров");
        phonebook.get("Денисов");
        phonebook.get("Комаров");
        phonebook.get("Соколова");
    }
}
