import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Укажите стрелки >>--> или <--<<");
        Scanner scanner = new Scanner(System.in);
        String arrows = scanner.nextLine();
        int count = 0;

        if (arrows.length() > 106) {
            System.out.println("Ошибка: строка превышает максимально допустимую длину 106 символов)");
            return;
        }
        // Проходим по строке, проверяя возможные стрелки
        for (int i = 0; i <= arrows.length() - 5; i++) {
            String substring = arrows.substring(i, i + 5);
            if (substring.equals(">>-->") || substring.equals("<--<<")) {
                count++;
            }
        }

        System.out.println("Найдено стрелок: " + count);
    }
}