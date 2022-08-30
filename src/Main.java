import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            task_1(console);
            task_2(console);
            task_3(console);
            task_4(console);
            task_5(console);
            task_6(console);
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
        System.out.println("***\n");
    }

    public static void task_4(BufferedReader console) throws IOException {
        /*
        Напишите программу, которая помогает определить в какое учреждение нужно отправить человека в зависимости от его возраста:
        - Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
        - Если человек от 7 до 18 лет, то ему нужно ходить в школу;
        - Если человеку больше 18 лет, но меньше 24, то его место в университете;
        - А если человеку больше 24, то ему пора ходить на работу

        При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        “Если возраст человека равен … , то ему нужно ходить … *(в зависимости от возраста дописать нужное)*”

        - Критерии оценки:
        - Переменные инициализированы
        - Имя переменных отражает данные, которые они содержат
        - Параметры условного оператора решают задание
        - Решение задачи выводится в консоль
        - Для решения использована конструкция else
         */
        String template = "Если возраст человека равен %d годам, то ему нужно ходить %s.";
        System.out.println("Задание 4");
        System.out.println("Введите возраст человека.");
        int age = enterTheNumber(console);
        if (age < 2) {
            System.out.println("Возраст слишком мал или некорректен");
            System.out.println("***\n");
            return;
        }
        if (age < 7) System.out.printf(template + "%n", age, " в детский сад");
        else if (age < 19) System.out.printf(template + "%n", age, "в школу");
        else if (age < 24) System.out.printf(template + "%n", age, "в университет");
        else System.out.printf(template + "%n", age, "на работу");
        System.out.println("***\n");
    }

    public static void task_5(BufferedReader console) throws IOException {
        /*
        Как правило, на аттракционах действуют ограничения и для детей по возрасту:
            - Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
            - Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
            - Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение о том, можно ли ребенку
        кататься одному или в сопровождении взрослого в зависимости от того, сколько ему лет.
        Критерии оценки:
            - Переменные инициализированы
            - Имя переменных отражает данные, которые они содержат
            - Параметры условного оператора решают задание
            - Решение задачи выводится в консоль
            - Для решения использована конструкция else
         */
        System.out.println("Задание 5");
        System.out.println("Введите возраст ребенка.");
        int age = enterTheNumber(console);
        if (age < 0) {
            System.out.println("Возраст некорректен");
            System.out.println("***\n");
            return;
        }
        if (age <= 5) System.out.println("Ребенок не может кататься на атракционе!");
        else if (age < 14) System.out.println("Ребенок может кататься только в сопровождении взрослого!");
        else System.out.println("Ребенок может кататься без сопровождения.");
        System.out.println("***\n");
    }

    public static void task_6(BufferedReader console) throws IOException {
        /*
        Даны три числа: int one; int two; int free. С помощью условного оператора и конструкции else напишите программу,
        которая вычисляет, какое из трех чисел бОльшее и выводит результат в консоль.
        Критерии оценки:
            - Переменные инициализированы
            - Параметры условного оператора решают задание
            - Решение задачи выводится в консоль
            - Для решения использована конструкция else
         */
        System.out.println("Задание 6");
        System.out.println("Введите первое число");
        int one = enterTheNumber(console);
        System.out.println("Введите второе число");
        int two = enterTheNumber(console);
        System.out.println("Введите третье число");
        int free = enterTheNumber(console);
        if (one >= two && one >= free) System.out.println("Наибольшее из введеных чисел: " + one);
        else if (two >= one && two >= free) System.out.println("Наибольшее из введеных чисел: " + two);
        else System.out.println("Наибольшее из введеных чисел: " + free);
        System.out.println("***\n");
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