package M3Task1;

import java.util.Arrays;

public class String1M3 {
    //Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    public static void main(String[] args) {
        String[] array = new String[]{"firstOne", "secondOne", "theThird"};

        for (int i = 0; i < array.length; i++) {            //достаем первое слово разбиваем его на массив
            char[] array1 = array[i].toCharArray();
            int t = 0;
            for (int j = 0; j < array1.length; j++) {
                if (Character.isUpperCase(array1[j])) {
                    t++;
                }
            }
            char[] array2 = new char[array1.length + t];
            int a = 0;
            for (int j = 0; j < array1.length; j++) {      //добавляем '_' в массив.
                if (Character.isUpperCase(array1[j])) {
                    array2[a + 1] = array1[j];
                    array2[a] = '_';
                    a = a + 2;
                } else {
                    array2[a] = array1[j];
                    a++;
                }
            }
            String str = new String(array2);           // преобразовываем массив слова в строку
            array[i] = str.toLowerCase();              // помещаем строку в массив и изменяем регистр на нижний
        }
        System.out.println(Arrays.toString(array));
    }
}
