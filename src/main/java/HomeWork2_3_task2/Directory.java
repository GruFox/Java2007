package HomeWork2_3_task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Directory {
    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();
        phonebook.add("a", "1");
        phonebook.add("b", "2");
        phonebook.add("a","3");
        phonebook.add("b","4");

        System.out.println(phonebook.phonebook);

        System.out.println(phonebook.get("a"));



    }
}
