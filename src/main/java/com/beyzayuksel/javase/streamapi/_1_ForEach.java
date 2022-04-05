package com.beyzayuksel.javase.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_ForEach {
    public static void main(String[] args) {
        // Stream api collection yapılarıyla çalışır.
        // Normal dizi
        //1. durum dizi
        String [] dizi={"malatya", "istanbul", "ankara"};
        // normal diziyi collection yapılarına çevirmek için çevirme işlemi asList();
        Arrays.asList().stream().forEach(System.out::println);

        //2. durum dizi
        List<String> liste1 = Arrays.asList("malatya", "istanbul", "ankara");
        liste1.stream().forEach(System.out::println);

        // 3. durum
        List<String> liste2 = new ArrayList<>();
        liste2.add("ma");
        liste2.add("is");
        liste2.add("an");
        liste2.forEach(System.out::println);
        liste2.stream().forEach(System.out::println);
    }
}
