package Task2;

import java.util.Arrays;

public class Strings2 {
    //дана строка "thirdOneWithMoreWords", заменить все заглавные буквы на "_", т.е. "third_ne_ith_ore_ords"
    public static void main(String[] args) {
        String str = "thirdOneWithMoreWords";
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                array[i] = '_';
            }
        }
        //System.out.println(Arrays.toString(array));

        String str1 = new String(array);
        System.out.println(str1);
    }
}
