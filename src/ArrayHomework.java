import java.util.*;

public class ArrayHomework {

    public static Set<String> getDistinctWords(String[] words){
        //Можно добавить в цикле, но утилита Arrays.asList возвращает объект ArrayList<>, который можно передать в конструктор Setу
        return new HashSet<>(Arrays.asList(words));
    }

    public static Map<String, Integer> getDistinctWordsCount(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: words ) {
            //В качестве альтернативы можно проверять get() на null
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }


}
