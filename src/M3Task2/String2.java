package M3Task2;

public class String2 {
    //Замените в строке все вхождения 'word' на 'letter'.
    public static void main(String[] args) {

        String str = "the world is beautiful when there is no war in the world";
        String str1 = str.replace("world","letter");
        System.out.println(str1);
    }
}
