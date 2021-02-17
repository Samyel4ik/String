package M3Task1;

import Task0.String0;

import java.util.Arrays;

public class String1M3 {
    //Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    public static void main(String[] args) {
        String[] array = new String[]{"firstOne", "secondOne", "theThird"};

        for (int i = 0; i < array.length; i++) {
            array[i] = String0.modifiedString(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
