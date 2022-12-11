package HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(name, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(name, phonesForLastName);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name) ;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ainura", "1111");
        phoneBook.add("Adilet", "2222");
        phoneBook.add("Tima", "3333");
        phoneBook.add("Ainura", "8888888");
        phoneBook.add("Ainura", "343434");
        phoneBook.add("ZHandos", "2222");
        phoneBook.add("Erdos", "3333");
        phoneBook.add("Amina", "4444");
        System.out.println("номера: " + phoneBook.get("Ainura"));


    }


}




