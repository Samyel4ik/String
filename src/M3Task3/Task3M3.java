package M3Task3;

public class Task3M3 {
    //В строке найти количество цифр.
    public static void main(String[] args) {
        String str = "the world 12 is beautiful 45  when 42 there is no 3 war in 2 the world";
        char[] array = str.toCharArray();

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                number++;
            }
        }
        System.out.println("Количество чисел в строке:" + number);
    }
}
