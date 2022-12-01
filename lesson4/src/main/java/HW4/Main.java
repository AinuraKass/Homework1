package HW4;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String[] listOfWords = {"ручка", "бумага", "карандаш", "тетрадь", "ручка", "карандаш", "школа", "универ", "крем", "ручка", "озвучка", "комп", "ноутбук", "обучение", "курсы"};
        System.out.println(Arrays.toString(listOfWords));
        LinkedHashSet<String> listUniqueWords = new LinkedHashSet<>(Arrays.asList(listOfWords));
        System.out.println("список уникальных слов - " + listUniqueWords);


        HashMap<String, Integer> uniqueWordsCount = new HashMap<>();

        for (int i = 0; i < listOfWords.length; i++) {
            if (uniqueWordsCount.containsKey(listOfWords[i])) {
                uniqueWordsCount.put(listOfWords[i], uniqueWordsCount.get(listOfWords[i]) + 1);
            } else {
                uniqueWordsCount.put(listOfWords[i], 1);
            }
        }

        System.out.println("сколько раз встречается каждое слово - " + uniqueWordsCount);


    }

    }


