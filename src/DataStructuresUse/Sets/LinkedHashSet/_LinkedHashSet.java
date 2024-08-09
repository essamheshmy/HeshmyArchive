package DataStructuresUse.Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class _LinkedHashSet {
    public static void linkedHashSet(){

        LinkedHashSet<String> languages = new LinkedHashSet<>();
            languages.add("Java");
            languages.add("Python");
            languages.add("JavaScript");

            languages.add("Java"); // لن يتم إضافته لأنها موجودة بالفعل

            for (String language : languages) {
                System.out.println(language);
            }
        }
    }

