package homeWork;

import java.util.Scanner;

public class HW030323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose button:");
        int button = scanner.nextInt();

        switch (button) {
            case 1:
                System.out.println("Espresso");
                System.out.println("Неделимый процес");
                break;

            case 2:
                System.out.println("Amerikano");
                System.out.println("Приготовление эспрессо и добавление воды");
                break;

            case 3:
                System.out.println("Kopucino");
                System.out.println("Приготовление эспрессо и добавление вспененного молока");
                break;

            case 4:
                System.out.println("Tea");
                System.out.println("Выбор пакетиеи и добавление воды");
                break;

            default:
                System.out.println("You have not chosen a drink");

        }

//                                Сложность второе имели это или другое?

//            switch (button) {
//                case "Espresso", "Amerikano", "Kapucino", "Tea":
//                    System.out.println("Dreanks");
//                    break;
//                case "N":
//                    System.out.println("Choose you Dreanks");
//                default:
//            }


    }
}
