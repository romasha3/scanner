import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть п'ять слів: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        String e = sc.nextLine();

        String sectence = a.concat(" ").concat(b).concat(" ").concat(c).concat(" ").concat(d).concat(" ").concat(e);
        System.out.println(sectence);

        System.out.println("Завдання 2");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введіть п'ять слів: ");
        String word1 = sc1.nextLine();
        String word2 = sc1.nextLine();
        String word3 = sc1.nextLine();
        String word4 = sc1.nextLine();
        String word5 = sc1.nextLine();

        System.out.println("Перші літери слів: ");

        System.out.println(word1.substring(0, 1));
        System.out.println(word2.substring(0, 1));
        System.out.println(word3.substring(0, 1));
        System.out.println(word4.substring(0, 1));
        System.out.println(word5.substring(0, 1));

        System.out.println("Завдання 4");
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = sc2.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = sc2.nextLine();

        if (firstName.toLowerCase().equals(secondName.toLowerCase())) {
            System.out.println("Імена ідентичні");
        } else {
            System.out.println("Імена не ідентичні");
        }

        System.out.println("Завдання 5");

        Scanner sc3 = new Scanner(System.in);

        // Запитати користувача про перший рядок
        System.out.print("Введіть перший рядок: ");
        String firstString = sc3.nextLine();

        // Запитати користувача про другий рядок
        System.out.print("Введіть другий рядок: ");
        String secondString = sc3.nextLine();

        // Порівняти кількість символів у першому і другому рядках
        if (firstString.length() > secondString.length()) {
            System.out.println("Перший рядок має більше символів");
        } else if (firstString.length() < secondString.length()) {
            System.out.println("Другий рядок має більше символів");
        } else {
            System.out.println("Рядки мають однакову кількість символів");
        }
    }
}
