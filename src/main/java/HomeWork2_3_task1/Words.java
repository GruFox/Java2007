package HomeWork2_3_task1;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ехал");
        words.add("грека");
        words.add("через");
        words.add("реку");
        words.add("видит");
        words.add("грека");
        words.add("в");
        words.add("реке");
        words.add("рак");
        words.add("сунул");
        words.add("грека");
        words.add("руку");
        words.add("в");
        words.add("реку");
        words.add("рак");
        words.add("за");
        words.add("руку");
        words.add("греку");
        words.add("цап");

        System.out.println(words);


        LinkedHashSet<String> set = new LinkedHashSet<>(words);
        System.out.println(set);

        for (String s : set) {          //Почти сам реализовал этот метом, тоже крутил два цикла.
            int count = 0;              //Сравнивал слова.
            for (String b : words) {    //Но почему-то недокрутил.
                if (s.equals(b)) {      //Подсмотрел Ваш разбор. Спасибо.
                    count ++;
                }
            }
            System.out.println("Слово " + s + " встречается " + count + " раз");
        }

        //Или, что более лучше, как Вы объяснили...

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            int count = 1;
            if (map.containsKey(s)){
                count = map.get(s) + 1;
            }
            map.put(s, count);
        }
        System.out.println(map);
    }
}










