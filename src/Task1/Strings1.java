package Task1;

import java.util.Scanner;

public class Strings1 {
    // дан символ, если он в нижнем регистре - преобразовать в верхний,
    // если в верхнем - то в нижний, т.е. "с" -> "С", "С" -> "с"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ:");
        String s = scanner.nextLine();

        if (s == s.toUpperCase()) {
            System.out.println("Символ был в верхнем регистре");
            System.out.println(s.toLowerCase());
        } else {
            System.out.println("Символ был в нижнем регистре");
            System.out.println(s.toUpperCase());
        }
    }
}
