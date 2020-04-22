package com.test.mapinterface;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "Jeden");
        stringMap.put("2", "Dwa");
        stringMap.put("3", "Trzy");
        stringMap.put("4", "Cztery");

        //przejści po wszystkich elementach mapy i wyświetlenie ich na konsoli
        Set<String> keySet = stringMap.keySet();
        for (String key:keySet) {
            System.out.println("Klucz: " + key + "wartość: " + stringMap.get(key));
        }
        //sprawdzenie czy mapa zawiera klucz
        System.out.println("Mapa zawiera klucz 1: " + stringMap.containsKey("1"));
        System.out.println("Mapa zwiera klucz 10: " + stringMap.containsKey("10"));

        //sprawdzenie czy mampa zawiera wartość
        System.out.println("Mapa zawiera wartość 1: " + stringMap.containsValue("Jeden"));
        System.out.println("Mapa zawiera wartość 5: " + stringMap.containsValue("Pięć"));

        //wyświetlenie zawartości mapy przy pomocy przeciażonej metody toString
        System.out.println(stringMap.toString());
        String message = "1, 2, 3, Start. Programujemy coraz lepiej...";
        System.out.println("Oryginalny komunikat: " + message);
        Set<String> words = stringMap.keySet();
        for (String word:words) {
            message = message.replace(word, stringMap.get(word));
        }
        System.out.println("Komunikat po zmianie: " + message);
    }
}
