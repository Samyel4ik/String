package M3Task5;

import java.util.Arrays;

public class String5M3 {
    //Удалить в строке все лишние пробелы, то есть серии подряд идущих
    // пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
    public static void main(String[] args) {
        String text = "the  world  12 is beautiful  45   when 42 there11 is no 3 war in 2 the world";

        text = text.replaceAll("\\s+", " ");
        System.out.println(text);
    }
}
