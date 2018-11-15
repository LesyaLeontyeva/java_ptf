package ru.stqa.pft.sandbox;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java","C#","Python","PHP"};

        List<String> languages = Arrays.asList("Java","C#","Python","PHP");

// l попеременно принимает значения имен языков из массива
        for (String l: languages){
            System.out.println("I wanna learn " + l);
        }
    }
}
