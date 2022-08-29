import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            task_1(console);
            task_2(console);
            task_3(console);
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong.");
        }
    }
    public static void task_1(BufferedReader console) throws IOException {
        /*
        С помощью условного оператора напишите программу, которая выводит в консоль:
        - поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        - информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        - Критерии оценки:
        - Переменные инициализированы
        - Имя переменных отражает данные, которые она содержит
        - Параметры условного оператора решают задание
        - Решение задачи выводится в консоль
        - Подсказка
         */
        System.out.println("Задание 1");
        System.out.println("Пожалуйста, укажите ваш возраст.");
        int age = enterTheNumber(console);
        if (age >= 18) System.out.println("Поздравляем, вы совершеннолетний!");
        else System.out.println("Извините, но вы еще не совершеннолетний. Вам нужно немного подождать...");
        System.out.println("***\n");
    }
    public static void task_2(BufferedReader console) throws IOException {
        /*
            Напишите программу, которая выводит в консоль сообщение о том, что:
            - ребенок ходит в школу, если его возраст равен или больше 7 годам
            - человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
            - человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
            - Критерии оценки:
            - Переменные инициализированы
            - Имя переменных отражает данные, которые она содержит
            - Параметры условного оператора решают задание
            - Решение задачи выводится в консоль
         */
        System.out.println("Задание 2");
        System.out.println("Пожалуйста, укажите возраст ребенка.");
        int age = enterTheNumber(console);
        if (age >= 7 && age < 18) System.out.println("Ребенок ходит в школу");
        else if (age >= 18 && age < 24) System.out.println("Ребенок закончил школу и может отправляться в университет");
        else if (age >= 24) System.out.println("Ребенок уже не ребенок. Пора бы ему искать работу...");
        else System.out.println("Ой, да он совсем малыш. Дайте ему конфету!");
        System.out.println("***\n");
    }
    public static void task_3(BufferedReader console) throws IOException {
        /*
        Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне: сидячее или стоячее
        или вагон уже полностью забит.
        - Критерии оценки:
        - Переменные инициализированы
        - Имя переменных отражает данные, которые она содержит
        - Параметры условного оператора решают задание
        - Решение задачи выводится в консоль
             */
        int places = 102;
        int seats = 60;
        System.out.println("Задание 3");
        System.out.println("Пожалуйста, укажите число пассажиров (от 0 до 150)");
        int nop = enterTheNumber(console); //number of passengers
        if (nop >= 0 && nop < seats)
            System.out.println(String.format("В вагоне осталось %1$d сидячих мест и %2$d стоячих",
                    seats - nop, places - seats));
        else if (nop >= seats && nop < places)
            System.out.println(String.format("В вагоне не осталось сидячих мест? но есть %d", (places - nop))
                    + ((places - nop == 1) ? " стоячее." : " стоячих."));
        else if (nop == places) System.out.println("Мест нет!");
        else if (nop >= places && nop < 150)
            System.out.println("Вагон переполнен, люди сидят и стоят друг на друге!");
        else if (nop >= 150) System.out.println("Вы что из Индии??? Вагоны не резиновые!");
        else System.out.println("Ахах. Такого не бывает.");
    }
    static Integer enterTheNumber(BufferedReader console) throws IOException {
        while (true) {
            try {
                System.out.println("Введите целое число (арабскими цыфрами).");
                return Integer.parseInt(console.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Извините, но вы ввели не целое число.");
            }
        }
    }
}