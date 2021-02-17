package Task0;

public class String0 {
    //дана строка "thirdOneWithMoreWords", преобразовать её в строку "third_one_with_more_words"
    public static void main(String[] args) {

        String str = "thirdOneWithMoreWords";
        System.out.println(modifiedString(str));
    }

    public static char[] arrayString(String str) {
        char[] array = str.toCharArray();
        return array;
    }

    public static int numCharactersArray(String str) {   // подсчет количества элементов в верхнем регистре
        char[] array = arrayString(str);
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                t++;
            }
        }
        return t;
    }

    public static String modifiedString(String str) {
        char[] array = arrayString(str);
        char[] array1 = new char[array.length + numCharactersArray(str)];  // создание массива длинной предусматривающее все символы и разделитель '_'
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
        str1 = str1.toLowerCase();
        return str1;
    }
}
