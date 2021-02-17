package M3Task4;

public class String4M3 {
    //В строке найти количество чисел.
    public static void main(String[] args) {
        String text = "the world 12 is beautiful 45  when 42 there11 is no 3 war in 2 the world";

        String[] words = text.split(" ");
        int t = 0;
        for (int i = 0; i < words.length; i++) {
            char[] array = words[i].toCharArray();

            for (int j = 0; j < array.length; j++) {
                if (Character.isDigit(array[j])) {
                    t++;
                    break;
                }
            }
        }
        System.out.println("Количество чисел в строке:" + t);
    }
}
