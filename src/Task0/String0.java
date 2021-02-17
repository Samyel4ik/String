package Task0;

import java.util.Arrays;

public class String0 {
    //дана строка "thirdOneWithMoreWords", преобразовать её в строку "third_one_with_more_words"
    public static void main(String[] args) {

        String str = "thirdOneWithMoreWords";
        char[] array = str.toCharArray();
        int t = 0;
        for (int i = 0; i < array.length; i++) {   // подсчет количества элементов в верхнем регистре
            if (Character.isUpperCase(array[i])) {
                t++;
            }
        }
        char[] array1 = new char[array.length + t];  // создание массива длинной предусматривающее все символы и разделитель '_'
        int a = 0;
        for (int i = 0; i < array.length; i++) {      // прогоняем массив исходный, сдвигая перед боьшим символом на '_'
            if (Character.isUpperCase(array[i])) {
                array1[a + 1] = array[i];
                array1[a] = '_';
                a = a + 2;
            } else {
                array1[a] = array[i];
                a++;
            }
        }
        String str1 = new String(array1);
        System.out.println(str1.toLowerCase());     // выводим строку приведя ее к нижнему регистру
    }
}
