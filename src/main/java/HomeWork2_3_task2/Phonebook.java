package HomeWork2_3_task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    HashMap<String, String> phonebook = new HashMap<>();
    public void add(String phone, String name){
        phonebook.put(phone, name);
    }

    public Set<String> get(String name){
        Set<String> ph = new HashSet<>();
        for (Map.Entry<String, String> entry : phonebook.entrySet()){
            if (entry.getValue().equals(name)) {
                ph.add(entry.getKey());
            }
        }
        return ph;

    }
}
